/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Hieu
 */
public class SocacSoNguyen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n3=0,n5=0;
        for(int i=0;i<s.length();i++){
            int tmp=Integer.parseInt(String.valueOf(s.charAt(i)));
            if(tmp==3){
                n3+=1;
            }
            if(tmp==5){
                n5+=1;
            }
        }
        int n=n3+n5;
        if(((n==3)||(n==5))&n==s.length()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
