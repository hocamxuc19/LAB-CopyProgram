/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import java.util.List;
import model.Customer;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Company {
    private static List<Customer> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    
    //Add Sample Data
    public void addSampleData(){
        list.add(new Customer("cus-001", "Nobita", "0905112233"));
        list.add(new Customer("cus-002", "Shizukon", "0905123456"));
        list.add(new Customer("cus-003", "Suneo", "0905271101"));
    }
    
    //Add Customer
    public void addCustomer(){
        //Instance
        Customer customer = new Customer("cus-001", "Nobita", "0905112233");
        
        
        System.out.print("Enter customer ID: ");
        customer.setID(sc.nextLine());
        
        System.out.print("Enter customer name: ");
        customer.setNAME(sc.nextLine());
        
        System.out.print("Enter customer phone number: ");
        customer.setPHONE(sc.nextLine());
        
        list.add(customer);
    }
    
    //List All Customer
    public void listAllCustomers(){
        int count = 0;
        System.out.println("==================");
        System.out.println("LIST ALL CUSTOMERS");
        System.out.println("==================");
        
        for(Customer cus : list){
            System.out.println(cus);
            count++;
        }
        System.out.println("-------------------");
        System.out.println("Total: " + count + " customer(s)");
    }
    
    //Seach Customer
    public void searchCustomer(){
        int choice;
        boolean finded = false;
        System.out.println("==================");
        System.out.println("SEARCH CUSTOMER");
        System.out.println("==================");
        System.out.println("1. Search by Customer ID");
        System.out.println("2. Search by Customer Name");
        System.out.print("Enter your selection: ");
        choice = sc.nextInt();
        switch(choice){
            case 1: //Search by Customer ID
                    sc.nextLine();
                    System.out.print("Enter search id: ");
                    finded = searchById(sc.nextLine());
                    if(!finded){
                        System.out.println(">>> Customer not found! <<<");
                    }
                    break;
            case 2: //Seach by Customer Name
                    sc.nextLine();
                    System.out.print("Enter search name: ");
                    finded = searchByName(sc.nextLine());
                    if(finded == false){
                        System.out.println(">>> Customer not found! <<<");
                    }
                    break;
            default: searchCustomer();
        }
    }
    
    private static boolean searchById(String id){
        boolean finded = false;
        for(Customer cus : list){
            if(cus.getID().equals(id)){
                System.out.println(">>> Customer found <<<");
                System.out.println(cus);
                finded = true;
            }
        }
        return finded;
    }   
    
    private static boolean searchByName(String name){
        boolean finded = false;
        for(Customer cus : list){
            if(cus.getNAME().equals(name)){
                System.out.println(">>> Customer found <<<");
                System.out.println(cus);
                finded = true;
            }
        }
        return finded;
    }
}
