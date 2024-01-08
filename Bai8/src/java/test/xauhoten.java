/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

public class xauhoten {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            while(n>0){
                n--;
                String s=sc.nextLine();
                s=s.trim().toLowerCase();
                s=s.replaceAll("\\s+"," ");
                String[] str=s.split(" ");
                s="";
                for(int i=0;i<str.length;i++){
                    if(i==0|| i== str.length-1){
                    s+=String.valueOf(str[i].charAt(0)).toUpperCase()+str[i].substring(1);
                    }
                    else{
                        s+=str[i].toLowerCase();
                    }
                    s+=" ";
                }
                System.out.println(s);
            }
        }
    }
