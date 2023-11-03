/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class People {
    private String Name;
    private int Age;
    private boolean Gender;

    public People() {
    }

    public People(String Name, int Age, boolean Gender) {
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    
    public String showInfo() {
        return "People{" + "Name=" + Name + ", Age=" + Age + ", Gender=" + Gender + '}';
    }
    
    
    
    
}
