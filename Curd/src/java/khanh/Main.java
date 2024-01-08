/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khanh;

import java.util.Scanner;

class TuLieu{
    private String ma,tenNhaXB;
    private double gia;
    private int soLuong;

    public TuLieu() {
    }

    public TuLieu(String tenNhaXB, double gia, int soLuong) {
        this.tenNhaXB = tenNhaXB;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNhaXB() {
        return tenNhaXB;
    }

    public void setTenNhaXB(String tenNhaXB) {
        this.tenNhaXB = tenNhaXB;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}

class Bao extends TuLieu implements ITuLieu{
    private String ngay,ten;

    public Bao() {
    }

    public Bao(String ngay, String ten, String tenNhaXB, double gia, int soLuong) {
        super(tenNhaXB, gia, soLuong);
        this.ngay = ngay;
        this.ten = ten;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
}
interface ITuLieu{
    double getGia();
}
class SachHoc extends TuLieu{
    private String ten,tenTG;
    private int soTrang;

    public SachHoc() {
    }

    public SachHoc(String ten, String tenTG, int soTrang, String tenNhaXB, double gia, int soLuong) {
        super(tenNhaXB, gia, soLuong);
        this.ten = ten;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    }
}
