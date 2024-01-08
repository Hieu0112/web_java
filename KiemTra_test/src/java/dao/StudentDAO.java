/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entity.Classes;
import entity.Students;
public class StudentDAO extends DBContext{
//    Doc tat ca cac ban ghi tu table Student
    public List<Students>getAll(){
        List<Students>list=new ArrayList<>();
        String sql="select * from Students";
        ClassesDAO cd= new ClassesDAO();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Students c = new Students(rs.getString("StudentID"),
                        rs.getString("FirstName"),
                        rs.getString("LastName"),
                        rs.getString("MobilePhone"),
                        rs.getString("Birthday"),
                        rs.getString("ClassID"));
                Classes cl= cd.getClassesById(rs.getString("ClassID"));
                c.setClasses(cl);
                list.add(c);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    //Insert a category
    public void insert(Students c){
        String sql = "INSERT INTO [dbo].[Students]\n"
                + "           ([StudentID]\n"
                + "           ,[FirstName]\n"
                + "           ,[LastName]\n"
                + "           ,[MobilePhone]\n"
                + "           ,[Birthday]\n"
                + "           ,[ClassID])"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?)";
        try{
            PreparedStatement st =connection.prepareCall(sql);
            st.setString(1, c.getStudentID());
            st.setString(2, c.getFirstName());
            st.setString(3, c.getLastName());
            st.setString(4, c.getMobilePhone());
            st.setString(5, c.getBirthday());
            st.setString(6, c.getClassID());
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public Students getStudentById(String id){
        ClassesDAO cd= new ClassesDAO();
        String sql="select * from Students WHERE StudentID=?";
        try{
            PreparedStatement st =connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Students c = new Students(rs.getString("StudentID"),
                        rs.getString("FirstName"),
                        rs.getString("LastName"),
                        rs.getString("MobilePhone"),
                        rs.getString("Birthday"),
                        rs.getString("ClassID"));
                Classes cl= cd.getClassesById(rs.getString("ClassID"));
                c.setClasses(cl);
                return c;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public List<Students>getStudentsByCid(String cid){
        ClassesDAO cd= new ClassesDAO();
        List<Students>list=new ArrayList<>();
        String sql="SELECT [StudentID]\n"
                + "      ,[FirstName]\n"
                + "      ,[LastName]\n"
                + "      ,[MobilePhone]\n"
                + "      ,[Birthday]\n"
                + "      ,[ClassID]\n"
                + "  FROM [dbo].[Students]\n"
                + "  WHERE ClassID = ?";
        try{
            PreparedStatement st =connection.prepareStatement(sql);
            st.setString(1, cid);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Students c = new Students(rs.getString("StudentID"),
                        rs.getString("FirstName"),
                        rs.getString("LastName"),
                        rs.getString("MobilePhone"),
                        rs.getString("Birthday"),
                        rs.getString("ClassID"));
                Classes cl= cd.getClassesById(rs.getString("ClassID"));
                c.setClasses(cl);
                list.add(c);
            }
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
    public void delete(String id){
        String sql = "DELETE FROM [dbo].[Students]\n"
                + "           WHERE StudentID=?";
        try{
            PreparedStatement st =connection.prepareCall(sql);
            st.setString(1, id);
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void update(Students c){
        String sql = "UPDATE [dbo].[Students]\n"
                + "   SET [FirstName] = ?"
                + "      ,[LastName] = ?"
                + "      ,[MobilePhone] = ?"
                + "      ,[Birthday] = ?"
                + "      ,[ClassID] = ?"
                + " WHERE StudentID=?";
        try{
            PreparedStatement st =connection.prepareCall(sql);
            st.setString(1, c.getFirstName());
            st.setString(2, c.getLastName());
            st.setString(3, c.getMobilePhone());
            st.setString(4, c.getBirthday());
            st.setString(5, c.getClassID());
            st.setString(6, c.getStudentID());
            st.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        StudentDAO c=new StudentDAO();
        List<Students> list=c.getStudentsByCid("D23QT");
        for (Students student : list) {
            System.out.println(student.getLastName()+" " + student.getClassID()+ student.getClasses());
        }
    }
}
