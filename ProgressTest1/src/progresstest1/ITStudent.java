/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progresstest1;

/**
 *
 * @author PC
 */
public class ITStudent extends people {
    private double javaScore;
    private double cssScore;

    public ITStudent() {
    }

    public ITStudent(float javaScore, float cssScore) {
        this.javaScore = javaScore;
        this.cssScore = cssScore;
    }

    private ITStudent(String Name, String Address, int Age, double average) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(float javaScore) {
        this.javaScore = javaScore;
    }

    public double getCssScore() {
        return cssScore;
    }

    public void setCssScore(float cssScore) {
        this.cssScore = cssScore;
    }

    public ITStudent(double javaScore, double cssScore, String Name, String Address, int Age, int average) {
        super(Name, Address, Age, average);
        this.javaScore = javaScore;
        this.cssScore = cssScore;
    }

  

    @Override
    public String toString() {
        return "ITStudent{" + "Name" + Name + "Address"+ Address + "age"+Age+ "average"+average+ "javaScore=" + javaScore + ", cssScore=" + cssScore + '}';
    }

    /**
     *
     * @return
     */
    @Override
    public double average(){
        
        return (3 * this.javaScore + this.cssScore)/4;
        
    }
    
}
