/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Hieu
 */
public class VATTU {
    private String maVTu,tenVTu,dvTinh,phanTram;

    public VATTU() {
    }

    public VATTU(String maVTu, String tenVTu, String dvTinh, String phanTram) {
        this.maVTu = maVTu;
        this.tenVTu = tenVTu;
        this.dvTinh = dvTinh;
        this.phanTram = phanTram;
    }

    
    public String getMaVTu() {
        return maVTu;
    }

    public void setMaVTu(String maVTu) {
        this.maVTu = maVTu;
    }

    public String getTenVTu() {
        return tenVTu;
    }

    public void setTenVTu(String tenVTu) {
        this.tenVTu = tenVTu;
    }

    public String getDvTinh() {
        return dvTinh;
    }

    public void setDvTinh(String dvTinh) {
        this.dvTinh = dvTinh;
    }

    public String getPhanTram() {
        return phanTram;
    }

    public void setPhanTram(String phanTram) {
        this.phanTram = phanTram;
    }

    @Override
    public String toString() {
        return this.maVTu+" "+this.tenVTu+" "+this.dvTinh+" "+this.phanTram;
    }
    
    
}
