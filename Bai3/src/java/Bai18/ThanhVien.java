/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai18;

/**
 *
 * @author Hieu
 */
public class ThanhVien {
    private int id;
    private String tenDangNhap;
    private String matkhau;
    private String VaiTro;

    public ThanhVien() {
    }

    public ThanhVien(int id, String tenDangNhap, String matkhau, String VaiTro) {
        this.id = id;
        this.tenDangNhap = tenDangNhap;
        this.matkhau = matkhau;
        this.VaiTro = VaiTro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }
    
}
class NVQuanLy extends ThanhVien{
    private String ten,diachi,email,sdt;

    public NVQuanLy() {
    }

    public NVQuanLy(String ten, String diachi, String email, String sdt, int id, String tenDangNhap, String matkhau, String VaiTro) {
        super(id, tenDangNhap, matkhau, VaiTro);
        this.ten = ten;
        this.diachi = diachi;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
}
class NVKho extends ThanhVien{
    private String ten,diachi,email,sdt;

    public NVKho(String ten, String diachi, String email, String sdt, int id, String tenDangNhap, String matkhau, String VaiTro) {
        super(id, tenDangNhap, matkhau, VaiTro);
        this.ten = ten;
        this.diachi = diachi;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
}
class NVBanHang extends ThanhVien{
    private String ten,diachi,email,sdt;

    public NVBanHang(String ten, String diachi, String email, String sdt, int id, String tenDangNhap, String matkhau, String VaiTro) {
        super(id, tenDangNhap, matkhau, VaiTro);
        this.ten = ten;
        this.diachi = diachi;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
}
class KhachHang extends ThanhVien{
    private String ten,diachi,email,sdt;

    public KhachHang(String ten, String diachi, String email, String sdt, int id, String tenDangNhap, String matkhau, String VaiTro) {
        super(id, tenDangNhap, matkhau, VaiTro);
        this.ten = ten;
        this.diachi = diachi;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
}
class MonAn{
    private int id;
    private String ten;
    private double gia;

    public MonAn(int id, String ten, double gia) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
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
class DatBan{
    private int id;
    private String vitri,trangthai;

    public DatBan(int id, String vitri, String trangthai) {
        this.id = id;
        this.vitri = vitri;
        this.trangthai = trangthai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    
}
class HoaDon{
    public MonAn monAn;
    public DatBan datban;

    public HoaDon(MonAn monAn, DatBan datban) {
        this.monAn = monAn;
        this.datban = datban;
    }

    public MonAn getMonAn() {
        return monAn;
    }

    public void setMonAn(MonAn monAn) {
        this.monAn = monAn;
    }

    public DatBan getDatban() {
        return datban;
    }

    public void setDatban(DatBan datban) {
        this.datban = datban;
    }
    
}