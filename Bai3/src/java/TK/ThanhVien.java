/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TK;

import java.util.List;

/**
 *
 * @author Hieu
 */
public class ThanhVien {
    private String username,password,role;

    public ThanhVien() {
    }

    public ThanhVien(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
class NVQL extends ThanhVien{
    private String ten,sdt;

    public NVQL() {
    }

    public NVQL(String ten, String sdt, String username, String password, String role) {
        super(username, password, role);
        this.ten = ten;
        this.sdt = sdt;
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
class BanDoc extends ThanhVien{
    private String ten,sdt;

    public BanDoc() {
    }

    public BanDoc(String ten, String sdt, String username, String password, String role) {
        super(username, password, role);
        this.ten = ten;
        this.sdt = sdt;
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
class TheBanDoc {
    private BanDoc bd;
    private String id,name,thoiGian;

    public TheBanDoc(BanDoc bd, String id, String name, String thoiGian) {
        this.bd = bd;
        this.id = id;
        this.name = name;
        this.thoiGian = thoiGian;
    }

    public BanDoc getBd() {
        return bd;
    }

    public void setBd(BanDoc bd) {
        this.bd = bd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }
    
}

class taiLieu{
    private int id,sl;
    private String name;

    public taiLieu() {
    }

    public taiLieu(int id, int sl, String name) {
        this.id = id;
        this.sl = sl;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
class NCC{
    private int id;
    private String name,sdt;

    public NCC() {
    }

    public NCC(int id, String name, String sdt) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
}
class HoaDon{
    private List<taiLieu>tl;
    private List<NCC>ncc;
    private int sl;
    private int id;

    public HoaDon() {
    }

    public HoaDon(int sl, int id,List<taiLieu> tl, List<NCC> ncc) {
        
        this.sl = sl;
        this.id = id;
        this.tl = tl;
        this.ncc = ncc;
        
    }

    public List<taiLieu> getTl() {
        return tl;
    }

    public void setTl(List<taiLieu> tl) {
        this.tl = tl;
    }

    public List<NCC> getNcc() {
        return ncc;
    }

    public void setNcc(List<NCC> ncc) {
        this.ncc = ncc;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}