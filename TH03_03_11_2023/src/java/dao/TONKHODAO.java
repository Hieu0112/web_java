/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.TONKHO;
import entity.VATTU;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Hieu
 */
public class TONKHODAO extends DBContext{
    public List<TONKHO>getAll(){
        List<TONKHO>list=new ArrayList<>();
        String sql="select * from TONKHO";
        VatTuDAO vtd= new VatTuDAO();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                TONKHO c = new TONKHO(rs.getString("namthang"),
                        rs.getString("mavtu"),
                        rs.getInt("slDau"),
                        rs.getInt("tongsln"),
                        rs.getInt("tongslx"),
                        rs.getInt("slcuoi"));
                boolean exist=false;
                for (TONKHO tonkho : list) {
                    if(c.getMaVTu().equalsIgnoreCase(tonkho.getMaVTu())){
                        exist=true;
                        tonkho.setTongSLN(tonkho.getTongSLN()+c.getTongSLN());
                        tonkho.setTongSLX(tonkho.getTongSLX()+c.getTongSLX());
                        break;
                    }
                }
                if(!exist){
                    VATTU vt_tmp=vtd.getVATTUById(c.getMaVTu());
                    c.setVt(vt_tmp);
                    list.add(c);
                }
            }
            Collections.sort(list, (TONKHO a, TONKHO b) -> {
                return a.getTongSLX()*-1;});
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    public static void main(String[] args) {
        TONKHODAO cd= new TONKHODAO();
        List<TONKHO> c = cd.getAll();
        TONKHO res= c.get(0);
        VATTU vt= res.getVt();
        System.out.println(vt.getDvTinh());
//        Collections.sort(c, (TONKHO a, TONKHO b) -> {
//            return a.getTongSLX()*-1;
//        });
//        for (TONKHO tonkho : c) {
//            System.out.println(tonkho);
//        }
    }
}
