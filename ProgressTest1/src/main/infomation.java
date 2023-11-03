/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import progresstest1.Bizstudents;
import progresstest1.ITStudent;
import progresstest1.people;

/**
 *
 * @author PC
 */
public class infomation {
   
    public static void nhapthongtinsinhvien(){
    ArrayList<people> dsNhanVien = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số lượng sinh viên: ");
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        System.out.println("Nhập thông tin sinh vien thứ "+(i+1)+":");
        System.out.print("Chọn loại nhân viên (1-sinh viên IT, 2-sinh viên Biz): ");
        int loai = sc.nextInt();
        System.out.print("Nhập Name: ");
        String Name = sc.next();
        System.out.print(" Nhập Adress ");
        String Address = sc.next();
        System.out.print(" Nhập Age");
        int Age = sc.nextInt();
        

        if(loai == 1){
            System.out.print("Nhập JavaScore: ");
            double JavaScore = sc.nextDouble();
            System.out.println("Nhập CssScore:");
            double CssScore = sc.nextDouble();
            ITStudent it = new ITStudent();
            dsNhanVien.add(it);
        }
        else{
            System.out.println("Nhập accountingscore");
            double accountingscore = sc.nextDouble();
            System.out.println("Nhập marketingscore");
            double marketingscore = sc.nextDouble();
            Bizstudents biz = new Bizstudents();
            dsNhanVien.add(biz);
        }
    }
}
    
}
