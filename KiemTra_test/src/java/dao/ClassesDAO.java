/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Classes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hieu
 */
public class ClassesDAO extends DBContext{
    
    //Tim 1 category khi co id
    public Classes getClassesById(String id){
        String sql="select * from Classes WHERE ClassID=?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Classes c = new Classes(rs.getString("ClassID"),
                        rs.getString("ClassName"));
                return c;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public static void main(String[] args) {
        ClassesDAO cd= new ClassesDAO();
        Classes c= cd.getClassesById("D23QT");
        System.out.println(c);
    }
}
