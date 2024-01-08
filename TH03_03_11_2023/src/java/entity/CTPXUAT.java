/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Hieu
 */
public class CTPXUAT {
    private String soPx,maVTu;
    private int SlXuat;
    private String DgXuat;

    public CTPXUAT() {
    }

    public CTPXUAT(String soPx, String maVTu, int SlXuat, String DgXuat) {
        this.soPx = soPx;
        this.maVTu = maVTu;
        this.SlXuat = SlXuat;
        this.DgXuat = DgXuat;
    }

    public String getSoPx() {
        return soPx;
    }

    public void setSoPx(String soPx) {
        this.soPx = soPx;
    }

    public String getMaVTu() {
        return maVTu;
    }

    public void setMaVTu(String maVTu) {
        this.maVTu = maVTu;
    }

    public int getSlXuat() {
        return SlXuat;
    }

    public void setSlXuat(int SlXuat) {
        this.SlXuat = SlXuat;
    }

    public String getDgXuat() {
        return DgXuat;
    }

    public void setDgXuat(String DgXuat) {
        this.DgXuat = DgXuat;
    }
    
    
}
