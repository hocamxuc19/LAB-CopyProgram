/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4a;

/**
 *
 * @author PC
 */
public class nhanvienthoivu extends nhanvien{
    private Double mucluongchietkhauthoivu;

    public nhanvienthoivu() {
    }

    public nhanvienthoivu(Double mucluongchietkhauthoivu) {
        this.mucluongchietkhauthoivu = mucluongchietkhauthoivu;
    }
    
    
    public nhanvienthoivu(Double mucluongchietkhauthoivu, int id, String name, int age, int birthday, int day, Double wage) {
        super(id, name, age, birthday, day, wage);
        this.mucluongchietkhauthoivu = 0.5;
        this.mucluongchietkhauthoivu = mucluongchietkhauthoivu;
    }


    public Double getMucluongchietkhauthoivu() {
        return mucluongchietkhauthoivu;
    }

    public void setMucluongchietkhauthoivu(Double mucluongchietkhauthoivu) {
        this.mucluongchietkhauthoivu = mucluongchietkhauthoivu;
    }
     @Override
    public String toString()
    {
        return "\nID:"+id+"\nName:"+name+"\nAge:"+age+"\nBirthday:"+birthday+"\nDay:"+day+"\nWage:"+wage;
    }
    @Override
    public double wage(){
        
        return getDay() *1000000 *mucluongchietkhauthoivu;
        
    }
    
}
    
    

