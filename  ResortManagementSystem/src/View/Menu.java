/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Menu {
  private Scanner sc = new Scanner(System.in);
  
//--------------------------------------------------------------------------- 
  
    public int menuManagementSystem(){
      int choice;
      System.out.println("--------------------------");
      System.out.println("-Resort Management System-");
      System.out.println("1.Quản lý dịch vụ.");
      System.out.println("2.Quản lý khách hàng.");
      System.out.println("3.Quản lý đặc phòng.");
      System.out.println("4.Tìm kiếm khách hàng.");
      System.out.println("5.Thoát khỏi chương trình.");
      System.out.println("-------------------------");
      System.out.println("Lựa chọn của bạn là:");
      choice = Integer.parseInt(sc.nextLine());
      return choice;
      
  }  
  
}
