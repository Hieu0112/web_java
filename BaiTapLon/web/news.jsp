

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Contact-ShopNha</title>
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
            integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />

        <link rel="stylesheet" href="./assest/css/root.css" />
        <link rel="stylesheet" href="./assest/css/reset.css" />
        <link rel="stylesheet" href="./assest/css/header.css" />
        <link rel="stylesheet" href="./assest/css/grid.css" />
        <link rel="stylesheet" href="./assest/css/footer.css" />
        <link rel="stylesheet" href="./assest/css/news.css" />
        <link rel="stylesheet" href="./assest/css/create-news.css" />
    </head>
    <body>
        <div id="app">

            <header class="header">
                <div class="grid wide">
                    <div class="nav-bar--extra">
                        <i class="fa-solid fa-bars"></i>
                    </div>
                    <div class="header-left">
                        <img src="./assest/images/logo/logo-header.png" alt="" />
                    </div>
                    <div class="header-center">
                        <div class="navbar8">
                            <ul class="navbar8-list">
                                <li class="navbar8-item">
                                    <a href="home">Trang chủ</a>
                                </li>
                                <!-- <li class="navbar8-item">
                                    <a href="">Sản phẩm</a>
                                </li> -->
                                <li class="navbar8-item">
                                    <a href="news">Tin tức</a>
                                </li>

                                <li class="navbar8-item">
                                    <a href="contact">Liên hệ</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="header-right">
                        <c:if test="${sessionScope.acc != null}">
                            <div class="login login-suss">
                                <span class="login-name">${sessionScope.acc.user_name}</span>
                                <div class="login-profile">
                                    <a href="profile" class="profile-a">Trang cá nhân</a>
                                    <a href="buyorder" class="profile-a">Đơn hàng</a>
                                    <a href="logout" class="profile-a">Đơn xuất</a>
                                </div>

                            </div>                         
                        </c:if>                     
                        <c:if test="${sessionScope.acc == null}">
                            <a href="Login.jsp"><div class="login login-suss">
                                    <span class="login-name">Đăng nhập</span>                               
                                </div></a>  

                        </c:if>


                        <div class="cart-icon">
                            <a href="showcart">
                                <i class="fa-solid fa-cart-shopping"></i>
                            </a>

                        </div>
                    </div>
                </div>
            </header>
            <div class="content">
                <div class="news clearfix">
                    <div class="Create-newss hidden">
                        <div class="overlay-news"></div>
                        <div class="content-create-news">
                            <form action="./news" method="post" class="form-news">
                                <div class="news-group">
                                    <label for="news-date">Ngày</label>
                                    <input name="date" type="date" id="news-date" />
                                </div>
                                <div class="news-group">
                                    <label for="news-image">Ảnh</label>
                                    <input name="image" type="text" id="news-image" placeholder="đường dẫn ảnh" />
                                </div>
                                <div class="news-group">
                                    <label for="news-title">Tiêu đề</label>
                                    <input name="title" type="text" id="news-title" placeholder="Nhập tiêu đề" />
                                </div>
                                <div class="news-group">
                                    <label for="news-link">Link chi tiết</label>
                                    <input name="link" type="text" id="news-link" placeholder="Link bài viết" />
                                </div>
                                <div class="news-group">
                                    <label for="news-desc">Mô tả</label>
                                    <textarea name="desc" type="text" id="news-desc" cols="30" rows="6"></textarea>
                                </div>
                                <div id="Create-new1">
                                    <button type="submit">Tạo mới</button>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="content-news1">
                        <!--noi dung new1 o day-->
                    </div>
                    <div class="content-news2">
                        <div class="trend-news">
                            <h5>BÀI VIẾT MỚI</h5>
                            <div class="news2-content"></div>
                        </div>
                    </div>
                </div>
                <c:if test="${sessionScope.acc.isAdmin == 1}">
                    <div class="create-newpp">Tạo bài viết mới</div>
                </c:if>

                <jsp:include page="Footer.jsp"></jsp:include>
            </div>
        </div>
    </body>
    <script src="./assest/js/new1.js"></script>
    <script src="./assest/js/hiddenCreateNew.js"></script>
</html>
