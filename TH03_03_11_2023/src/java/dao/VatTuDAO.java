/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.VATTU;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class VatTuDAO extends DBContext{
//    Doc tat ca cac ban ghi tu table Student
    public List<VATTU>getAll(){
        List<VATTU>list=new ArrayList<>();
        String sql="select * from VATTU";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                VATTU c = new VATTU(rs.getString("MaVTu"),
                        rs.getString("TenVTu"),
                        rs.getString("DvTinh"),
                        rs.getString("PhanTram"));
                list.add(c);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    //Insert a Vattu
    public void insert(VATTU c){
        String sql = "INSERT INTO [dbo].[VATTU]\n"
                + "           ([MaVTu]\n"
                + "           ,[TenVTu]\n"
                + "           ,[DvTinh]\n"
                + "           ,[PhanTram])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        try{
            PreparedStatement st =connection.prepareCall(sql);
            st.setString(1, c.getMaVTu());
            st.setString(2, c.getTenVTu());
            st.setString(3, c.getDvTinh());
            st.setString(4, c.getPhanTram());
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public VATTU getVATTUById(String id){
        String sql="select * from VATTU WHERE MaVTu=?";
        try{
            PreparedStatement st =connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                VATTU c = new VATTU(rs.getString("MaVTu"),
                        rs.getString("TenVTu"),
                        rs.getString("DvTinh"),
                        rs.getString("PhanTram"));
                return c;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public void delete(String id){
        String sql = "DELETE FROM [dbo].[VATTU]\n"
                + "           WHERE MaVTu=?";
        try{
            PreparedStatement st =connection.prepareCall(sql);
            st.setString(1, id);
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void update(VATTU c){
        String sql = "UPDATE [dbo].[VATTU]\n"
                + "   SET [TenVTu] = ?"
                + "      ,[DvTinh] = ?"
                + "      ,[PhanTram] = ?"
                + " WHERE MaVTu=?";
        try{
            PreparedStatement st =connection.prepareCall(sql);
            st.setString(1, c.getTenVTu());
            st.setString(2, c.getDvTinh());
            st.setString(3, c.getPhanTram());
            st.setString(4, c.getMaVTu());
            st.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }   
    public static void main(String[] args) {
        VatTuDAO c=new VatTuDAO();
        List<VATTU>vattu=c.getAll();
        for (VATTU vattu1 : vattu) {
            System.out.println(vattu1);
        }
    }
}
