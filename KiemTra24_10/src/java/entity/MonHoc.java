/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Hieu
 */
public class MonHoc {
    private String mamon,tenmonhoc;
    private int sotinchi;

    public MonHoc() {
    }

    public MonHoc(String mamon, String tenmonhoc, int sotinchi) {
        this.mamon = mamon;
        this.tenmonhoc = tenmonhoc;
        this.sotinchi = sotinchi;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getTenmonhoc() {
        return tenmonhoc;
    }

    public void setTenmonhoc(String tenmonhoc) {
        this.tenmonhoc = tenmonhoc;
    }

    public int getSotinchi() {
        return sotinchi;
    }

    public void setSotinchi(int sotinchi) {
        this.sotinchi = sotinchi;
    }

    @Override
    public String toString() {
        return mamon+" "+tenmonhoc+" ";
    }
    
    
}
