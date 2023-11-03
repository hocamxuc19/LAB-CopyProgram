package ModelCustomer;
import java.time.LocalDate;
import java.util.Date;

public class Customer {
    private String makhachhang;
    private String hoten;
    private Date ngaysinh;
    private String gioitinh;
    private String cmnd;
    private String phone;
    private String email;
    private String loaiCustomer;
    private String diachi;

    public Customer() {
    }

    public Customer(String makhachhang, String hoten, Date ngaysinh, String gioitinh, String cmnd, String phone, String email, String loaiCustomer, String diachi) {
        this.makhachhang = makhachhang;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
        this.loaiCustomer = loaiCustomer;
        this.diachi = diachi;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiCustomer() {
        return loaiCustomer;
    }

    public void setLoaiCustomer(String loaiCustomer) {
        this.loaiCustomer = loaiCustomer;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "Customer{" + "makhachhang=" + makhachhang + ", hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", cmnd=" + cmnd + ", phone=" + phone + ", email=" + email + ", loaiCustomer=" + loaiCustomer + ", diachi=" + diachi + '}';
    }
    
    
    
}


