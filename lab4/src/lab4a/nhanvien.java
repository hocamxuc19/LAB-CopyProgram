/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4a;

/**
 *
 * @author PC
 */
public class nhanvien {

    static void sort() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
protected int id;
public String name;
protected int age;
protected int birthday;
public double wage;//lương
protected int day;//số ngày làm việc trong tháng
    

    public nhanvien() {
    }

    public nhanvien(int id, String name, int age, int birthday, int day, double wage) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.day = day;//số ngày làm việc trong tháng
        this.wage = wage;//lương
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
    public double wage(){
    
    return 0;
    
    
    }

    @Override
    public String toString() {
        return "nhanvien{" + "id=" + id + ", name=" + name + ", age=" + age + ", birthday=" + birthday + ", wage=" + wage + ", day=" + day + '}';
    }




   
    
}
