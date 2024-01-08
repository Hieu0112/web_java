/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Hieu
 */
public class Math implements Serializable{
    private String num1="",num2="",op="";

    public Math() {
    }

    public Math(String num1, String num2, String op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
    
    public String getResult(){
        String res="Result phep tinh: ";
        try {
            double a,b;
            a=Double.parseDouble(this.num1);
            b=Double.parseDouble(this.num2);
        switch (this.op) {
            case "+":
                res=res+ this.num1+" "+this.op+" "+this.num2+" = " +(a+b);
                break;
            case "-":
                res=res+ this.num1+" "+this.op+" "+this.num2+" = " +(a-b);
                break;
            case "*":
                res=res+ this.num1+" "+this.op+" "+this.num2+" = " +(a*b);
                break;
            case "/":
                if(b==0)
                    res+="Phep tinh khong the thuc hien voi phep chia 0";
                else
                    res=res+ this.num1+" "+this.op+" "+this.num2+" = " +(a/b);
                break;
            }
        }
        catch (NumberFormatException e) {
            res+="Chua phai so de tinh toan";
        }
        return res;
    }
        
}
