/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4b;

import java.util.ArrayList;
import java.util.Comparator;
//</editor-fold>
import java.util.Scanner;
import lab4a.nhanvien;
import lab4a.nhanvienchinhthuc;
import lab4a.nhanvienthoivu;
import java.util.Collections;


/**
 *
 * @author PC
 */
public class quanlinhanvien {
    ArrayList<nhanvien> dsNhanVien = new ArrayList<>();
   
        
public void nhapdanhsachsinhanvien(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số lượng nhân viên: ");
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        System.out.println("Nhập thông tin nhân viên thứ "+(i+1)+":");
        System.out.print("Chọn loại nhân viên (1-Nhân viên chính thức, 2-Nhân viên thời vụ): ");
        int loai = sc.nextInt();
        System.out.print("Nhập ID: ");
        int id = sc.nextInt();
        System.out.print("Nhập họ tên: ");
        String name = sc.next();
        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.print("Nhập ngày sinh: ");
        String birthday = sc.next();
        System.out.print("Nhập số ngày làm việc trong tháng: ");
        int day;
        day = sc.nextInt();

        if(loai == 1){
            System.out.print("Nhập số giờ OT: ");
            int ot;
            ot = sc.nextInt();
            nhanvienchinhthuc nvct = new nhanvienchinhthuc();
            dsNhanVien.add(nvct);
        }
        else{
            nhanvienthoivu nvtv = new nhanvienthoivu();
            dsNhanVien.add(nvtv);
        }
    }
}


public void xuatDanhSachTheoLoaiNhanVien(){
    System.out.println("\nDanh sách nhân viên:");
    for(nhanvien nv : dsNhanVien){
        if(nv instanceof nhanvienchinhthuc){
            System.out.println(((nhanvienchinhthuc) nv).toString());
        }
        else{
            System.out.println(((nhanvienthoivu) nv).toString());
        }
    }
}


public void sapXepGiamDanTheoLuong(){
    Collections.sort(dsNhanVien, (nhanvien nv1, nhanvien nv2) -> {
        if(nv1.wage > nv2.wage){
            return -1;
        }
        else{
            if(nv1.wage == nv2.wage){
                return 0;
            }
            else{
                return 1;
            }
        }
    });

    System.out.println("\nDanh sách nhân viên sau khi sắp xếp theo lương giảm dần:");
    for(nhanvien nv : dsNhanVien){
        System.out.println(nv.toString());
    }
}


public void timVaXoaNhanVienTheoTen(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập tên nhân viên cần xóa: ");
    String ten = sc.nextLine();
    for(nhanvien nv : dsNhanVien){
        if(nv.name.equals(ten)){
            
        
        }
    }
}

}
    
    

