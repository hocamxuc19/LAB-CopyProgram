/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import controller.Library;
import java.util.Scanner;

public class Menu {
    private static Library library = new Library();
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("1.list all book");
            System.out.println("2.Read to file");
            System.out.println("3.Search book");
            System.out.println("4.Add new book");
            System.out.println("5.Chimcut");
            System.out.println("Your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    sc.nextLine();
                    library.listOfBook();
                }
                case 2 ->{
                    sc.nextLine();
                    System.out.println("Please enter your File Name You Want :");
                    library.readTextFile(sc.nextLine());
                   
                }
                case 3 ->{
                     library.searchByBook();
                }
                case 4 ->{
                    System.out.println("Thanks use program");
                    System.exit(0);
                }   
                    
                default ->{
                    System.out.println("Thanks use program");
            }
            
        }
        
    }while(choice > 0 && choice <5);
    }

    
}
