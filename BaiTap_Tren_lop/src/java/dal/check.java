/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Account;

/**
 *
 * @author Hieu
 */
public class check {
    public static void main(String[] args) {
        List<Account>list=new ArrayList<>();
        DAO d=new DAO();
        list=d.getAll();
        for (Account account : list) {
            System.out.println(account.getName()+" "+account.getPass());
        }
    }
}
