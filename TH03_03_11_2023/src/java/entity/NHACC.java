/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Hieu
 */
public class NHACC {
    private String maNhaCc,tenNhaCc,diaChi,dienThoai;

    public NHACC() {
    }

    public NHACC(String maNhaCc, String tenNhaCc, String diaChi, String dienThoai) {
        this.maNhaCc = maNhaCc;
        this.tenNhaCc = tenNhaCc;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
    }

    public String getMaNhaCc() {
        return maNhaCc;
    }

    public void setMaNhaCc(String maNhaCc) {
        this.maNhaCc = maNhaCc;
    }

    public String getTenNhaCc() {
        return tenNhaCc;
    }

    public void setTenNhaCc(String tenNhaCc) {
        this.tenNhaCc = tenNhaCc;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }
    
}
