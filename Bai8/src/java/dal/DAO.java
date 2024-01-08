/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Category;
import model.Product;

/**
 *
 * @author Hieu
 */
public class DAO extends DBContext{
//    Lay list category
     public List<Category>getAll(){
        List<Category>list=new ArrayList<>();
         String sql = "SELECT [ID]\n"
                 + "      ,[name]\n"
                 + "      ,[describe]\n"
                 + "  FROM [dbo].[Categories]";
        try{
            PreparedStatement st =connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Category c = new Category(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("describe"));
                list.add(c);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
    //Tim 1 category khi co id
    public Category getCategoryById(int id){
        String sql="select * from Categories WHERE id=?";
        try{
            PreparedStatement st =connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Category c = new Category(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("describe"));
                return c;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public List<Product> getProductsByCid(int cid){
        List<Product>list=new ArrayList<>();
        String sql="SELECT [ID]\n"
                + "      ,[name]\n"
                + "      ,[quantity]\n"
                + "      ,[price]\n"
                + "      ,[releaseDate]\n"
                + "      ,[describe]\n"
                + "      ,[image]\n"
                + "      ,[cid]\n"
                + "  FROM [dbo].[products]\n"
                + "  WHERE 1=1 ";
        if(cid!=0){
            sql+=" and cid="+cid;
        }
        try{
            PreparedStatement st =connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Product p= new Product();
                p.setId(rs.getString("id"));
                p.setName(rs.getString("name"));
                p.setQuantity(rs.getInt("quantity"));
                p.setPrice(rs.getDouble("price"));
                p.setReleaseDate(rs.getString("releaseDate"));
                p.setImage(rs.getString("image"));
                Category c =getCategoryById(rs.getInt("cid"));
                p.setCategory(c);
                list.add(p);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return list;
    }
    
    public List<Product> getNewProducts(){
        List<Product>list=new ArrayList<>();
        String sql="SELECT TOP 3 [ID]\n"
                + "      ,[name]\n"
                + "      ,[quantity]\n"
                + "      ,[price]\n"
                + "      ,[releaseDate]\n"
                + "      ,[describe]\n"
                + "      ,[image]\n"
                + "      ,[cid]\n"
                + "  FROM [dbo].[products]\n"
                + "  order by releaseDate desc";
        try{
            PreparedStatement st =connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Product p= new Product();
                p.setId(rs.getString("id"));
                p.setName(rs.getString("name"));
                p.setQuantity(rs.getInt("quantity"));
                p.setPrice(rs.getDouble("price"));
                p.setReleaseDate(rs.getString("releaseDate"));
                p.setImage(rs.getString("image"));
                Category c =getCategoryById(rs.getInt("cid"));
                p.setCategory(c);
                list.add(p);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    public List<Product> getOldProducts(){
        List<Product>list=new ArrayList<>();
        String sql="SELECT TOP 3 [ID]\n"
                + "      ,[name]\n"
                + "      ,[quantity]\n"
                + "      ,[price]\n"
                + "      ,[releaseDate]\n"
                + "      ,[describe]\n"
                + "      ,[image]\n"
                + "      ,[cid]\n"
                + "  FROM [dbo].[products]\n"
                + "  order by releaseDate";
        try{
            PreparedStatement st =connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Product p= new Product();
                p.setId(rs.getString("id"));
                p.setName(rs.getString("name"));
                p.setQuantity(rs.getInt("quantity"));
                p.setPrice(rs.getDouble("price"));
                p.setReleaseDate(rs.getString("releaseDate"));
                p.setImage(rs.getString("image"));
                Category c =getCategoryById(rs.getInt("cid"));
                p.setCategory(c);
                list.add(p);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    public List<Product> searchByKey(String key){
        List<Product>list=new ArrayList<>();
        String sql="SELECT [ID]\n"
                + "      ,[name]\n"
                + "      ,[quantity]\n"
                + "      ,[price]\n"
                + "      ,[releaseDate]\n"
                + "      ,[describe]\n"
                + "      ,[image]\n"
                + "      ,[cid]\n"
                + "  FROM [dbo].[products]\n"
                + "  where name like ? or describe like ?";
        try{
            PreparedStatement st =connection.prepareStatement(sql);
            st.setString(1, "%" + key +"%");
            st.setString(2, "%" + key +"%");
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Product p= new Product();
                p.setId(rs.getString("id"));
                p.setName(rs.getString("name"));
                p.setQuantity(rs.getInt("quantity"));
                p.setPrice(rs.getDouble("price"));
                p.setReleaseDate(rs.getString("releaseDate"));
                p.setImage(rs.getString("image"));
                Category c =getCategoryById(rs.getInt("cid"));
                p.setCategory(c);
                list.add(p);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    public List<Product> searchByCheck(int[] cid){
        List<Product> list=new ArrayList<>();
        String sql="SELECT [ID]\n"
                + "      ,[name]\n"
                + "      ,[quantity]\n"
                + "      ,[price]\n"
                + "      ,[releaseDate]\n"
                + "      ,[describe]\n"
                + "      ,[image]\n"
                + "      ,[cid]\n"
                + "  FROM [dbo].[products]\n"
                + "  where 1=1 ";
        if(cid != null && cid[0]!=0){
            sql+=" and cid in(";
            for(int i=0;i<cid.length;i++){
                sql+=cid[i]+",";
            }
            if(sql.endsWith(",")){
                sql=sql.substring(0,sql.length()-1);
            }
            sql+=")";
        }
        try{
            PreparedStatement st =connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Product p= new Product();
                p.setId(rs.getString("id"));
                p.setName(rs.getString("name"));
                p.setQuantity(rs.getInt("quantity"));
                p.setPrice(rs.getDouble("price"));
                p.setReleaseDate(rs.getString("releaseDate"));
                p.setImage(rs.getString("image"));
                Category c =getCategoryById(rs.getInt("cid"));
                p.setCategory(c);
                list.add(p);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    public List<Product>getProductsByPrice(double from ,double to){
        List<Product> list=new ArrayList<>();
        String sql="SELECT [ID]\n"
                + "      ,[name]\n"
                + "      ,[quantity]\n"
                + "      ,[price]\n"
                + "      ,[releaseDate]\n"
                + "      ,[describe]\n"
                + "      ,[image]\n"
                + "      ,[cid]\n"
                + "  FROM [dbo].[products]\n"
                + "  where price between ? and ? ";
        try{
            PreparedStatement st =connection.prepareStatement(sql);
            st.setDouble(1, from);
            st.setDouble(2, to);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Product p= new Product();
                p.setId(rs.getString("id"));
                p.setName(rs.getString("name"));
                p.setQuantity(rs.getInt("quantity"));
                p.setPrice(rs.getDouble("price"));
                p.setReleaseDate(rs.getString("releaseDate"));
                p.setImage(rs.getString("image"));
                Category c =getCategoryById(rs.getInt("cid"));
                p.setCategory(c);
                list.add(p);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
