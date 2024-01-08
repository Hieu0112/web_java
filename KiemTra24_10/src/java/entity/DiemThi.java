/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Hieu
 */
public class DiemThi {
    private String mamon,masv;
    private double diemlan1,diemlan2;
    private MonHoc mh;
    public DiemThi() {
    }

    public DiemThi(String mamon, String masv, double diemlan1, double diemlan2) {
        this.mamon = mamon;
        this.masv = masv;
        this.diemlan1 = diemlan1;
        this.diemlan2 = diemlan2;
        this.mh=new MonHoc();
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public double getDiemlan1() {
        return diemlan1;
    }

    public void setDiemlan1(double diemlan1) {
        this.diemlan1 = diemlan1;
    }

    public double getDiemlan2() {
        return diemlan2;
    }

    public void setDiemlan2(double diemlan2) {
        this.diemlan2 = diemlan2;
    }

    public MonHoc getMh() {
        return mh;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    @Override
    public String toString() {
        return mh +" Diem lan 1: "+ diemlan1+" Diem lan 2: "+diemlan2;
    }
    
    
}
