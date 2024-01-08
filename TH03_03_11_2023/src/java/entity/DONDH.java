/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Hieu
 */
public class DONDH {
    private String soDh,ngayDh,maNhacc;

    public DONDH() {
    }

    public DONDH(String soDh, String ngayDh, String maNhacc) {
        this.soDh = soDh;
        this.ngayDh = ngayDh;
        this.maNhacc = maNhacc;
    }

    public String getSoDh() {
        return soDh;
    }

    public void setSoDh(String soDh) {
        this.soDh = soDh;
    }

    public String getNgayDh() {
        return ngayDh;
    }

    public void setNgayDh(String ngayDh) {
        this.ngayDh = ngayDh;
    }

    public String getMaNhacc() {
        return maNhacc;
    }

    public void setMaNhacc(String maNhacc) {
        this.maNhacc = maNhacc;
    }
    
}
