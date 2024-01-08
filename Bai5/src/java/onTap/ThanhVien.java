/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onTap;

import java.util.List;

/**
 *
 * @author Hieu
 */
public class ThanhVien {
    private String tenTK,matkhau;
    private int vaitro;

    public ThanhVien() {
    }

    public ThanhVien(String tenTK, String matkhau, int vaitro) {
        this.tenTK = tenTK;
        this.matkhau = matkhau;
        this.vaitro = vaitro;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public int getVaitro() {
        return vaitro;
    }

    public void setVaitro(int vaitro) {
        this.vaitro = vaitro;
    }
    
}
class NVKho extends ThanhVien{
    private String ten,sdt,quequan;

    public NVKho() {
    }

    public NVKho(String ten, String sdt, String quequan) {
        this.ten = ten;
        this.sdt = sdt;
        this.quequan = quequan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
    
}
class KhachHang extends ThanhVien{
    private String ten ,sdt,quequan;

    public KhachHang() {
    }

    public KhachHang(String ten, String sdt, String quequan) {
        this.ten = ten;
        this.sdt = sdt;
        this.quequan = quequan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
    
}
class NhaCungCap{
    private int id;
    private String ten,sdt;

    public NhaCungCap() {
    }

    public NhaCungCap(int id, String ten, String sdt) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
}
class MatHang{
    private int id;
    private String ten;
    private double gia;

    public MatHang(int id, String ten, double gia) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
    }

    public MatHang() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
}
class hoaDonNhap{
    private int id;
    private List<MatHang>mh;
    private NhaCungCap ncc;
    private double tongtien;
    private NVKho nv;

    public hoaDonNhap() {
    }

    public hoaDonNhap(int id, List<MatHang> mh, NhaCungCap ncc, double tongtien, NVKho nv) {
        this.id = id;
        this.mh = mh;
        this.ncc = ncc;
        this.tongtien = tongtien;
        this.nv = nv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<MatHang> getMh() {
        return mh;
    }

    public void setMh(List<MatHang> mh) {
        this.mh = mh;
    }

    public NhaCungCap getNcc() {
        return ncc;
    }

    public void setNcc(NhaCungCap ncc) {
        this.ncc = ncc;
    }

    public double getTongtien() {
        return tongtien;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    public NVKho getNv() {
        return nv;
    }

    public void setNv(NVKho nv) {
        this.nv = nv;
    }
    
}