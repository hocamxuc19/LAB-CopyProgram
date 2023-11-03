/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Booking;
import java.util.Date;

/**
 *
 * @author PC
 */
public class BookingManager {
    private String mabooking;
    private  Date ngaybooking;
    private Date checkin;
    private Date checkout;
    private String makhachhang;
    private String madichvu;

    public BookingManager() {
    }

    public BookingManager(String mabooking, Date ngaybooking, Date checkin, Date checkout, String makhachhang, String madichvu) {
        this.mabooking = mabooking;
        this.ngaybooking = ngaybooking;
        this.checkin = checkin;
        this.checkout = checkout;
        this.makhachhang = makhachhang;
        this.madichvu = madichvu;
    }

    public String getMabooking() {
        return mabooking;
    }

    public void setMabooking(String mabooking) {
        this.mabooking = mabooking;
    }

    public Date getNgaybooking() {
        return ngaybooking;
    }

    public void setNgaybooking(Date ngaybooking) {
        this.ngaybooking = ngaybooking;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getMadichvu() {
        return madichvu;
    }

    public void setMadichvu(String madichvu) {
        this.madichvu = madichvu;
    }

    @Override
    public String toString() {
        return "BookingManager{" + "mabooking=" + mabooking + ", ngaybooking=" + ngaybooking + ", checkin=" + checkin + ", checkout=" + checkout + ", makhachhang=" + makhachhang + ", madichvu=" + madichvu + '}';
    }
    
    
    
    
}
