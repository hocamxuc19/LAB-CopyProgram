/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelResorts;

/**
 *
 * @author PC
 */
public class House extends Resorts{
    private String tieuchuanphong;
    private int sotang;

    public House() {
    }

    public House(String tieuchuanphong, int sotang) {
        this.tieuchuanphong = tieuchuanphong;
        this.sotang = sotang;
    }

    public House(String tieuchuanphong, int sotang, String madichvu, String tendichvu, double dientichsudung, int soluongnguoitoida, String kieuthue) {
        super(madichvu, tendichvu, dientichsudung, soluongnguoitoida, kieuthue);
        this.tieuchuanphong = tieuchuanphong;
        this.sotang = sotang;
    }

    public String getTieuchuanphong() {
        return tieuchuanphong;
    }

    public void setTieuchuanphong(String tieuchuanphong) {
        this.tieuchuanphong = tieuchuanphong;
    }

    public int getSotang() {
        return sotang;
    }

    public void setSotang(int sotang) {
        this.sotang = sotang;
    }
      
    @Override
    public String toString() {
        return "House{" + "tieuchuanphong=" + tieuchuanphong + ", sotang=" + sotang + '}'+super.toString();
    }
    
    
}
