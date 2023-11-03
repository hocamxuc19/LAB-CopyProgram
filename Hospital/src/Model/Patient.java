/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class Patient extends People{
    private int patientID;
    private String joinTime;
    private String exitTime;

    public Patient() {
    }

    public Patient(int patientID, String joinTime, String exitTime) {
        this.patientID = patientID;
        this.joinTime = joinTime;
        this.exitTime = exitTime;
    }

    public Patient(int patientID, String joinTime, String exitTime, String Name, int Age, boolean Gender) {
        super(Name, Age, Gender);
        this.patientID = patientID;
        this.joinTime = joinTime;
        this.exitTime = exitTime;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    @Override
    public String showInfo() {
        return "Patient{" + "patientID=" + patientID + ", joinTime=" + joinTime + ", exitTime=" + exitTime + '}' +super.showInfo();
    }

    
    
    
    
    
}
