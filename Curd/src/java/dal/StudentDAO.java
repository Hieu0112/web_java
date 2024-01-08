/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Hieu
 */
public class StudentDAO extends DBContext{
//    Doc tat ca cac ban ghi tu table Student
    public List<Student>getAll(){
        List<Student>list=new ArrayList<>();
        String sql="select * from Student";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Student c = new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("gender"),
                        rs.getDouble("gpa"));
                list.add(c);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    //Insert a category
    public void insert(Student c){
        String sql = "INSERT INTO [dbo].[Student]\n"
                + "           ([id]\n"
                + "           ,[name]\n"
                + "           ,[gender]\n"
                + "           ,[gpa])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
//        String sql="insert into Categories values(?,?,?)";
        try{
            PreparedStatement st =connection.prepareCall(sql);
            st.setInt(1, c.getId());
            st.setString(2,c.getName());
            st.setString(3,c.getGender());
            st.setDouble(4, c.getGpa());
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    //Tim 1 category khi co id
    public Student getStudentById(int id){
        String sql="select * from Student WHERE id=?";
        try{
            PreparedStatement st =connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Student c = new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("gender"),
                        rs.getDouble("gpa")
                );
                return c;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    //delete a category
    public void delete(int id){
        String sql = "DELETE FROM [dbo].[Student]\n"
                + "           WHERE id=?";
        try{
            PreparedStatement st =connection.prepareCall(sql);
            st.setInt(1, id);
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void update(Student c){
        String sql = "UPDATE [dbo].[Student]\n"
                + "   SET [name] = ?\n"
                + "      ,[gender] = ?\n"
                + "      ,[gpa] = ?"
                + " WHERE id=?";
        try{
            PreparedStatement st =connection.prepareCall(sql);
            st.setString(1, c.getName());
            st.setString(2, c.getGender());
            st.setDouble(3, c.getGpa());
            st.setInt(4, c.getId());
            st.executeUpdate();
            st.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        StudentDAO c=new StudentDAO();
        Student a=c.getStudentById(6);
        a.setGpa(4.0);
        c.update(a);
        List<Student> list=c.getAll();
        for (Student student : list) {
            System.out.println(student.getGpa());
        }
    }
}
