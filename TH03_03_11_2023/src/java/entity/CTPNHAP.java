/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Hieu
 */
public class CTPNHAP {
    private String soPn,maVtu;
    private int SlNhap;
    private String dgNhap;

    public CTPNHAP() {
    }

    public CTPNHAP(String soPn, String maVtu, int SlNhap, String dgNhap) {
        this.soPn = soPn;
        this.maVtu = maVtu;
        this.SlNhap = SlNhap;
        this.dgNhap = dgNhap;
    }

    public String getSoPn() {
        return soPn;
    }

    public void setSoPn(String soPn) {
        this.soPn = soPn;
    }

    public String getMaVtu() {
        return maVtu;
    }

    public void setMaVtu(String maVtu) {
        this.maVtu = maVtu;
    }

    public int getSlNhap() {
        return SlNhap;
    }

    public void setSlNhap(int SlNhap) {
        this.SlNhap = SlNhap;
    }

    public String getDgNhap() {
        return dgNhap;
    }

    public void setDgNhap(String dgNhap) {
        this.dgNhap = dgNhap;
    }
    
}
