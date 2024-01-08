/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.SinhVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class SinhVienDAO extends DBContext{
//    Doc tat ca cac ban ghi tu table sinhvien
    public List<SinhVien>getAll(){
        List<SinhVien>list=new ArrayList<>();
        String sql="select * from sinhvien";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                SinhVien c = new SinhVien(rs.getString("maSv"),
                        rs.getString("HoTen"),
                        rs.getString("NgaySinh"),
                        rs.getString("GioiTinh"),
                        rs.getString("MaLop"));
                list.add(c);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    //Insert 1 sinhvien
    public void insert(SinhVien c){
        String sql = "INSERT INTO [dbo].[SinhVien]\n"
                + "           ([maSv]\n"
                + "           ,[HoTen]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[GioiTinh]\n"
                + "           ,[MaLop])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        try{
            PreparedStatement st =connection.prepareCall(sql);
            st.setString(1, c.getMasv());
            st.setString(2, c.getHoten());
            st.setString(3, c.getNgaysinh());
            st.setString(4, c.getGioitinh());
            st.setString(5, c.getMalop());
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public SinhVien getSinhVienById(String id){
        String sql="select * from SinhVien WHERE maSv=?";
        try{
            PreparedStatement st =connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                SinhVien c = new SinhVien(rs.getString("maSv"),
                        rs.getString("HoTen"),
                        rs.getString("NgaySinh"),
                        rs.getString("GioiTinh"),
                        rs.getString("MaLop"));
                return c;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
//    public List<Students>getStudentsByCid(String cid){
//        ClassesDAO cd= new ClassesDAO();
//        List<Students>list=new ArrayList<>();
//        String sql="SELECT [StudentID]\n"
//                + "      ,[FirstName]\n"
//                + "      ,[LastName]\n"
//                + "      ,[MobilePhone]\n"
//                + "      ,[Birthday]\n"
//                + "      ,[ClassID]\n"
//                + "  FROM [dbo].[Students]\n"
//                + "  WHERE ClassID = ?";
//        try{
//            PreparedStatement st =connection.prepareStatement(sql);
//            st.setString(1, cid);
//            ResultSet rs = st.executeQuery();
//            while(rs.next()){
//                Students c = new Students(rs.getString("StudentID"),
//                        rs.getString("FirstName"),
//                        rs.getString("LastName"),
//                        rs.getString("MobilePhone"),
//                        rs.getString("Birthday"),
//                        rs.getString("ClassID"));
//                Classes cl= cd.getClassesById(rs.getString("ClassID"));
//                c.setClasses(cl);
//                list.add(c);
//            }
//            
//        }catch(SQLException e){
//            System.out.println(e);
//        }
//        return list;
//    }
    
    public void delete(String id){
        String sql = "DELETE FROM [dbo].[SinhVien]\n"
                + "           WHERE maSv=?";
        try{
            PreparedStatement st =connection.prepareCall(sql);
            st.setString(1, id);
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void update(SinhVien c){
        String sql = "UPDATE [dbo].[SinhVien]\n"
                + "   SET [HoTen] = ?\n"
                + "      ,[NgaySinh] = ?\n"
                + "      ,[GioiTinh] = ?\n"
                + "      ,[MaLop] = ?"
                + " WHERE maSv=?";
        try{
            PreparedStatement st =connection.prepareCall(sql);
            st.setString(1, c.getHoten());
            st.setString(2, c.getNgaysinh());
            st.setString(3, c.getGioitinh());
            st.setString(4, c.getMalop());
            st.setString(5, c.getMasv());
            st.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        SinhVienDAO c=new SinhVienDAO();
        List<SinhVien> list=c.getAll();
        for (SinhVien student : list) {
            System.out.println(student.getHoten());
        }
    }
}
