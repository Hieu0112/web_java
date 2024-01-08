
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Buy Order</title>        

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="./css/manageOrder.css">
        <style>
            .Order {
                text-decoration: underline;
            }
        </style>
    </head>

    <body>
        <jsp:include page="HeaderManage.jsp"></jsp:include>
        <c:forEach items="${listO}" var="o">
            <div class="order">      
                <div class="order-header">
                    <div class="order-date">Ngày đặt hàng: ${o.order_date}</div>
                    <div class="order-date">UserID Mua: ${o.user_id}</div>
                    <div class="order-total">Tổng giá trị đơn hàng: ${o.total_price}$</div>
                </div>
                <div class="order-body">
                    <div class="order-address">Địa chỉ: ${o.address}</div>
                    <div class="order-phone">Số điện thoại: ${o.phone_number}</div>
                    <c:if test="${o.status eq 'Pending Approval'}">
                        <div style="color: red; font-weight: bold;" class="order-status">Trạng thái: Chờ được duyệt</div>
                    </c:if>
                    <c:if test="${o.status != 'Pending Approval'}">
                        <div style="color: green; font-weight: bold;"  class="order-status">Trạng thái: Đã được duyệt</div>
                    </c:if>

                    <div class="status">
                        <a href="pendingapproval?order_id=${o.order_id}"><button>Bỏ duyệt đơn hàng</button></a>
                        <a href="approved?order_id=${o.order_id}"><button>Duyệt đơn hàng</button></a>
                    </div>
 
                    <!--detail-->
                    <div class="order-detail">
                        <button class="order-detail-button" onclick="toggleOrderDetail(this)"><i class="fa-solid fa-bars"></i> Chi tiết đơn hàng</button>
                        <div class="order-detail-content">
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th class="">
                                                <div class="">Sản phẩm</div>
                                            </th>
                                            <th class="">
                                                <div class="">Ảnh</div>
                                            </th>
                                            <th>
                                                <div class="">Gía</div>
                                            </th>
                                            <th class="">
                                                <div>Kích cỡ</div>
                                            </th>
                                            <th class="border-0 bg-light">
                                                <div>Số lượng</div>
                                            </th>
                                            <th>
                                                <div>Thành tiền</div>
                                            </th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${requestScope.listOD}" var="oo">
                                            <c:if test="${o.order_id==oo.order_id}">
                                                <tr>
                                                    <td class=""><strong>${oo.product.name}</strong></td>
                                                    <td>
                                                        <img src="${oo.product.image1}" height="100px" width="100px">
                                                    </td>

                                                    <td class=""><strong>${oo.price}</strong></td>
                                                    <td class=""><strong>${oo.size}</strong></td>
                                                    <td class=""><strong>${oo.quantity}</strong></td>

                                                    <td class="">                                                    
                                                        <fmt:formatNumber pattern="##.#" value="${oo.price*oo.quantity}"/>
                                                    </td>
                                                </tr>
                                            </c:if>
                                        </c:forEach>


                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>

        <script>
            function toggleOrderDetail(button) {
                button.parentElement.classList.toggle("active");
            }
        </script>
    </body>

</html>