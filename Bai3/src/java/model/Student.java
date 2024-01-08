/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hieu
 */
public class Student {
    private int id;
    private String name;
    private boolean gender;
    private int diem;

    public Student() {
    }

    public Student(int id, String name, boolean gender, int diem) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.diem = diem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return ""+id+" "+name+" "+(gender?"male":"female")+" "+diem;
    }
    
}
