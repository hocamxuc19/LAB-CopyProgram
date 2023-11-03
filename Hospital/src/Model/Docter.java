/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class Docter extends People{
    private String doctorId;
    private String roomCode;

    public Docter() {
    }

    public Docter(String doctorId, String roomCode) {
        this.doctorId = doctorId;
        this.roomCode = roomCode;
    }

    public Docter(String doctorId, String roomCode, String Name, int Age, boolean Gender) {
        super(Name, Age, Gender);
        this.doctorId = doctorId;
        this.roomCode = roomCode;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    @Override
    public String showInfo() {
        return "Docter{" + "doctorId=" + doctorId + ", roomCode=" + roomCode + '}' + super.showInfo();
    }

    
    
}
