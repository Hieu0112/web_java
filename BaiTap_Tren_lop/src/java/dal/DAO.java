/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import model.Account;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hieu
 */
public class DAO extends DBContext{
    public List<Account>getAll(){
        List<Account>list=new ArrayList<>();
        String sql="select * from account";
        try{
            PreparedStatement st =connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Account c = new Account(rs.getString("username"),
                        rs.getString("password"));
                list.add(c);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
