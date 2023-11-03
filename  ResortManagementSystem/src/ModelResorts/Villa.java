/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelResorts;

/**
 *
 * @author PC
 */
public class Villa extends Resorts{
    private String tieuchuanphong;
    private double dientichhoboi;
    private int sotang;

    public Villa() {
    }

    public Villa(String tieuchuanphong, double dientichhoboi, int sotang) {
        this.tieuchuanphong = tieuchuanphong;
        this.dientichhoboi = dientichhoboi;
        this.sotang = sotang;
    }

    public Villa(String tieuchuanphong, double dientichhoboi, int sotang, String madichvu, String tendichvu, double dientichsudung, int soluongnguoitoida, String kieuthue) {
        super(madichvu, tendichvu, dientichsudung, soluongnguoitoida, kieuthue);
        this.tieuchuanphong = tieuchuanphong;
        this.dientichhoboi = dientichhoboi;
        this.sotang = sotang;
    }
    
    public String getTieuchuanphong() {
        return tieuchuanphong;
    }

    public void setTieuchuanphong(String tieuchuanphong) {
        this.tieuchuanphong = tieuchuanphong;
    }

    public double getDientichhoboi() {
        return dientichhoboi;
    }

    public void setDientichhoboi(double dientichhoboi) {
        this.dientichhoboi = dientichhoboi;
    }

    public int getSotang() {
        return sotang;
    }

    public void setSotang(int sotang) {
        this.sotang = sotang;
    }

    
    @Override
    public String toString() {
        return "Villa{" + "tieuchuanphong=" + tieuchuanphong + ", dientichhoboi=" + dientichhoboi + ", sotang=" + sotang + '}'+super.toString();
    }          
}
