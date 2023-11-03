/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Company;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Menu {
    private static Company company = new Company(); //instance

   public static void menu(){
        int choice;
        Scanner sc = new Scanner(System.in);
        do{ 
            System.out.println("-------------------------");
            System.out.println("COMPANY MANAGEMENT SYSTEM");
            System.out.println("-------------------------");
            System.out.println("1. List All Customers");
            System.out.println("2. Search Customers");
            System.out.println("3. Add customers");
            System.out.println("4. Customer statistical");
            System.out.println("5. Exit");
            System.out.print("Your choice : ");
            choice = sc.nextInt();
            switch (choice){
                case 1 -> {
                    company.addSampleData();
                    company.listAllCustomers();
                    System.out.println("\n");
                    menu();
                }
                
                case 2 -> {
                    company.searchCustomer();
                    System.out.println("\n");
                    menu();
                }
                case 3 ->{
                    company.addCustomer();
                    System.out.println("\n");
                    menu();
                    
                }
                case 4 ->{
                    
//                    Customer statistical
                    
                }
                case 5 ->
                {
                    System.exit(0);
                }
                default -> System.exit(0);
                }
                
                }
                
            
        
        while (choice > 0 && choice < 6);
    }
}

    
    
        

