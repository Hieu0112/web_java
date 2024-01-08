/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Hieu
 */
public class PXUAT {
    private String soPx,ngayXuat,tenKh;

    public PXUAT() {
    }

    public PXUAT(String soPx, String ngayXuat, String tenKh) {
        this.soPx = soPx;
        this.ngayXuat = ngayXuat;
        this.tenKh = tenKh;
    }

    public String getSoPx() {
        return soPx;
    }

    public void setSoPx(String soPx) {
        this.soPx = soPx;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }
    
}
