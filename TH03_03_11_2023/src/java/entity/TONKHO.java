/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Hieu
 */
public class TONKHO{
    private String namThang,maVTu;
    private int slDau,tongSLN,tongSLX,slCuoi;
    private VATTU vt;

    public TONKHO() {
    }

    public TONKHO(String namThang, String maVTu, int slDau, int tongSLN, int tongSLX, int slCuoi) {
        this.namThang = namThang;
        this.maVTu = maVTu;
        this.slDau = slDau;
        this.tongSLN = tongSLN;
        this.tongSLX = tongSLX;
        this.slCuoi = slCuoi;
        this.vt=new VATTU();
    }

    public String getNamThang() {
        return namThang;
    }

    public void setNamThang(String namThang) {
        this.namThang = namThang;
    }

    public String getMaVTu() {
        return maVTu;
    }

    public void setMaVTu(String maVTu) {
        this.maVTu = maVTu;
    }

    public int getSlDau() {
        return slDau;
    }

    public void setSlDau(int slDau) {
        this.slDau = slDau;
    }

    public int getTongSLN() {
        return tongSLN;
    }

    public void setTongSLN(int tongSLN) {
        this.tongSLN = tongSLN;
    }

    public int getTongSLX() {
        return tongSLX;
    }

    public void setTongSLX(int tongSLX) {
        this.tongSLX = tongSLX;
    }

    public int getSlCuoi() {
        return slCuoi;
    }

    public void setSlCuoi(int slCuoi) {
        this.slCuoi = slCuoi;
    }

    public VATTU getVt() {
        return vt;
    }

    public void setVt(VATTU vt) {
        this.vt = vt;
    }
    @Override
    public String toString() {
        return maVTu+" "+tongSLX;
    }
    
    
}
