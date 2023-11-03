/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelResorts;

/**
 *
 * @author PC
 */
public class Resorts {
    private String madichvu;
    private String tendichvu;
    private double dientichsudung;
    private int soluongnguoitoida;
    private String kieuthue;

    public Resorts() {
    }

    public Resorts(String madichvu, String tendichvu, double dientichsudung, int soluongnguoitoida, String kieuthue) {
        this.madichvu = madichvu;
        this.tendichvu = tendichvu;
        this.dientichsudung = dientichsudung;
        this.soluongnguoitoida = soluongnguoitoida;
        this.kieuthue = kieuthue;
    }

    public String getMadichvu() {
        return madichvu;
    }

    public void setMadichvu(String madichvu) {
        this.madichvu = madichvu;
    }

    public String getTendichvu() {
        return tendichvu;
    }

    public void setTendichvu(String tendichvu) {
        this.tendichvu = tendichvu;
    }

    public double getDientichsudung() {
        return dientichsudung;
    }

    public void setDientichsudung(double dientichsudung) {
        this.dientichsudung = dientichsudung;
    }

    public int getSoluongnguoitoida() {
        return soluongnguoitoida;
    }

    public void setSoluongnguoitoida(int soluongnguoitoida) {
        this.soluongnguoitoida = soluongnguoitoida;
    }

    public String getKieuthue() {
        return kieuthue;
    }

    public void setKieuthue(String kieuthue) {
        this.kieuthue = kieuthue;
    }

    @Override
    public String toString() {
        return "Resorts{" + "madichvu=" + madichvu + ", tendichvu=" + tendichvu + ", dientichsudung=" + dientichsudung + ", soluongnguoitoida=" + soluongnguoitoida + ", kieuthue=" + kieuthue + '}';
    }

    
    

}
