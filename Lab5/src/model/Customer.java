    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class Customer {

     private String ID;
    private String NAME;
    private String PHONE;

    public Customer(String cus001, String nobita, String string) {
    }

    

    public String getID() {
        return ID;
    }

    public void setID(String nextLine) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    @Override
    public String toString() {
        return "Company{" + "ID = ," + ID + ", NAME = " + NAME + ", PHONE =" + PHONE + '}';
    }

    
    }
    

