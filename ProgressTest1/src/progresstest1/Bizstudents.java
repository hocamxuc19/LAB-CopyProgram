/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progresstest1;

/**
 *
 * @author PC
 */
public class Bizstudents extends people {
    private float accountingscore;
    private float marketingscore;

    public Bizstudents() {
    }

    public Bizstudents(float accountingscore, float marketingscore) {
        this.accountingscore = accountingscore;
        this.marketingscore = marketingscore;
    }

    public float getAccountingscore() {
        return accountingscore;
    }

    public void setAccountingscore(float accountingscore) {
        this.accountingscore = accountingscore;
    }

    public float getMarketingscore() {
        return marketingscore;
    }

    public void setMarketingscore(float marketingscore) {
        this.marketingscore = marketingscore;
    }

    public Bizstudents(float accountingscore, float marketingscore, String Name, String Address, int Age, int average) {
        super(Name, Address, Age, average);
        this.accountingscore = accountingscore;
        this.marketingscore = marketingscore;
    }
    
    @Override
    public String toString() {
        return "ITStudent{" + "Name" + Name + "Address"+ Address + "age"+Age+ "average"+average+ "javaScore=" + accountingscore + ", cssScore=" + marketingscore + '}';
    }
    @Override
    public double average(){
        
        return (3 * this.accountingscore+ this.marketingscore)/4;
        
    }    
    
}
