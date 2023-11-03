/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelResorts;

/**
 *
 * @author PC
 */
public class Room extends Resorts{
    private String dichvumienphidikem;

    public Room() {
    }

    public Room(String dichvumienphidikem) {
        this.dichvumienphidikem = dichvumienphidikem;
    }

    public Room(String dichvumienphidikem, String madichvu, String tendichvu, double dientichsudung, int soluongnguoitoida, String kieuthue) {
        super(madichvu, tendichvu, dientichsudung, soluongnguoitoida, kieuthue);
        this.dichvumienphidikem = dichvumienphidikem;
    }

    
    public String getDichvumienphidikem() {
        return dichvumienphidikem;
    }

    public void setDichvumienphidikem(String dichvumienphidikem) {
        this.dichvumienphidikem = dichvumienphidikem;
    }

    @Override
    public String toString() {
        return "Room{" + "dichvumienphidikem=" + dichvumienphidikem + '}'+super.toString();
    }
    
    
    
    
    
}
