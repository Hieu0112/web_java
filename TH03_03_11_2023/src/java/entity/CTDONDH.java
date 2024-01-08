/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Hieu
 */
public class CTDONDH {
    private String soDh,maVTu;
    private int SlDat;

    public CTDONDH() {
    }

    public CTDONDH(String soDh, String maVTu, int SlDat) {
        this.soDh = soDh;
        this.maVTu = maVTu;
        this.SlDat = SlDat;
    }

    public String getSoDh() {
        return soDh;
    }

    public void setSoDh(String soDh) {
        this.soDh = soDh;
    }

    public String getMaVTu() {
        return maVTu;
    }

    public void setMaVTu(String maVTu) {
        this.maVTu = maVTu;
    }

    public int getSlDat() {
        return SlDat;
    }

    public void setSlDat(int SlDat) {
        this.SlDat = SlDat;
    }
    
}
