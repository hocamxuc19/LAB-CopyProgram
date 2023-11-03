/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4a;

/**
 *
 * @author PC
 */
public class nhanvienchinhthuc extends nhanvien{
    protected double Ot;

    public nhanvienchinhthuc() {
    }

    public nhanvienchinhthuc(double Ot) {
        this.Ot = Ot;
    }

    public nhanvienchinhthuc(int id, String name, int age, int birthday, int day, double wage) {
        super(id, name, age, birthday, day, wage);
    }

    public double getOt() {
        return Ot;
    }

    public void setOt(double Ot) {
        this.Ot = Ot;
    }
  
    /**
     *
     * @return
     */
    
        
      
    @Override
    public String toString(){
        
        return "nhanvienchinhthuc{" + "Ot=" +Ot + super(toString())'}';
        
    }

    @Override
    public double wage() {
        return getDay() *1000000 + Ot *10000;
    }
    
        


    
    
}

