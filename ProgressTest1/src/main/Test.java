/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.Scanner;
import static main.infomation.nhapthongtinsinhvien;


/**
 *
 * @author PC
 */
public class Test {
    public static void main(String[] args) {
    
       
       int choice;
        do { 
            menu();
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1 ->
                nhapthongtinsinhvien();
                
                
                    
                    
                   
                
            }
           
            
                
            
        } while (choice != 0);
      
    }
    public static void menu()
            
    {
        System.out.println("--------School--------");
        System.out.println("1.Nhập thông tin sinh viên .");
        System.out.println("2.kiểm tra và in Sinh viên có cùng địa chỉ.");
        System.out.println("Mời bạn chọn: ");
    }
        
       
    
    
    
}
