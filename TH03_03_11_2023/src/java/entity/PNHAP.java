/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Hieu
 */
public class PNHAP {
    private String soPn,ngayNhap,soDh;

    public PNHAP() {
    }

    public PNHAP(String soPn, String ngayNhap, String soDh) {
        this.soPn = soPn;
        this.ngayNhap = ngayNhap;
        this.soDh = soDh;
    }

    public String getSoPn() {
        return soPn;
    }

    public void setSoPn(String soPn) {
        this.soPn = soPn;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getSoDh() {
        return soDh;
    }

    public void setSoDh(String soDh) {
        this.soDh = soDh;
    }
    
}
