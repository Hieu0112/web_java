/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phong;

import java.util.List;

/**
 *
 * @author Hieu
 */
public class ThanhVien {
    private int id;
    private String tendangnhap,password,vaitro;

    public ThanhVien() {
    }

    public ThanhVien(int id, String tendangnhap, String password, String vaitro) {
        this.id = id;
        this.tendangnhap = tendangnhap;
        this.password = password;
        this.vaitro = vaitro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }
     
}
class NVQuanLy extends ThanhVien{
    private String ten,diachi,sdt;

    public NVQuanLy() {
    }

    public NVQuanLy(String ten, String diachi, String sdt) {
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
}
class NVKho extends ThanhVien{
    private String ten,diachi,sdt;

    public NVKho() {
    }

    public NVKho(String ten, String diachi, String sdt) {
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
}

class NVBanHang extends ThanhVien{
    private String ten,diachi,sdt;

    public NVBanHang() {
    }

    public NVBanHang(String ten, String diachi, String sdt) {
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
}
class HoaDon{
    private int id;
    private String ngay;
    private double gia;

    public HoaDon() {
    }

    public HoaDon(int id, String ngay, double gia) {
        this.id = id;
        this.ngay = ngay;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
}
class KhachHang extends ThanhVien{
    private String ten,diachi,sdt;
    private List<HoaDon> list;

    public KhachHang() {
    }

    public KhachHang(String ten, String diachi, String sdt, List<HoaDon> list, int id, String tendangnhap, String password, String vaitro) {
        super(id, tendangnhap, password, vaitro);
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
        this.list = list;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public List<HoaDon> getList() {
        return list;
    }

    public void setList(List<HoaDon> list) {
        this.list = list;
    }
    
}
