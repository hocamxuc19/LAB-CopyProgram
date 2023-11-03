/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import model.Book;

/**
 *
 * @author PC
 */
public class Library {

    private static ArrayList<Book> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

//---------------------------------------------------
    public static void listOfBook() {
        int count = 0;
        for (Book book : list) {
            System.out.println(book);
            count++;

        }
        System.out.println("total\t" + count + "Books.");
    }

//---------------------------------------------------
    public static void readTextFile(String fileName) {
        try {
            FileReader fr = new FileReader("src/Resource/" + fileName + ".txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] bookData = line.split(",");
                String bookID = bookData[0];
                String bookTitle = bookData[1];
                String author = bookData[2];
                String yearpublished = bookData[3];

                Book book = new Book(bookID, bookTitle, author, yearpublished);
                list.add(book);
            }
            fr.close();
            br.close();

            System.out.println("Import Succesful!");
        } catch (IOException e) {
            System.out.println("File does not exist!");
        }

    }
//-----------------------------------------------------

    public static void dispaySearch(ArrayList<Book> bk) {
        for (Book book : bk) {
            System.out.println(book.toString());
        }
    }
//-----------------------------------------------------

    public static void searchByBook() {
        int choice;
        System.out.println("1.Search by BookID");
        System.out.println("2.Search by BookTital");
        System.out.println("3.Search by Author");
        System.out.println("4.Search by YearPublished");
        System.out.println("5.Return Menu");
        System.out.println("Your Choice:");
        choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
//            #1.Search by BookID
                String cusID = getValue("Enter your ID to search :");
                ArrayList<Book> cusIDsearch = search(c -> c.getBookID().startsWith(cusID));
                dispaySearch(cusIDsearch);
            }
            case 2 -> {
//            #2.Search by BookTital
                sc.nextLine();

            }
            case 3 -> {
//            #3.Search by Author
                sc.nextLine();

            }
            case 4 -> {
//            #4.Search by YearPublished
                sc.nextLine();

            }
            case 5 -> {
                System.out.println("Thanks use program.");
                System.exit(0);

            }
            default -> {
                searchByBook();
            }
        }
    }
//------------------------------------------------------

    public static ArrayList<Book> search(Predicate<Book> c) {
        ArrayList<Book> bk = new ArrayList<>();
        for (Book book : list) {
            if (c.test(book)) {
                bk.add(book);
            }
        }
        return bk;
    }
//
//input DATA

    public static String getValue(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.print(s);
        return sc.nextLine();
    }

//public static void searchByBookID(){
//    sc.nextLine();
//    System.out.println("Enter your BookID:");
//    String bookID = sc.nextLine();
//    boolean finded = false;
//    for(Book book : list){
//        if( book.getBookID().equals(bookID)){
//            System.out.println("------Finded Found-----");
//            System.out.println(book);
//            System.out.println("------------------------");
//            finded = true;
//            break;
//        }           
//    }
//   if(finded == false){
//        System.out.println("Finded not found!!Please Try Again!!");
//       
//    }
//     System.out.println("\n\n");
//}
////----------------------------------------------------------- 
//
//public static void searchByBookTital(){
//    System.out.println("Enter your BookTital:");
//    String bookTital = sc.nextLine();
//    boolean finded = false;
//    for(Book book : list){
//        if( book.getBookTitle().equals(bookTital)){
//            System.out.println("------Finded Found-----");
//            System.out.println(book);
//            System.out.println("------------------------");
//            finded = true;
//        }           
//    }
//    if(finded == false){
//        System.out.println("Finded not found!!Please Try Again!!");
//       
//    }
//     System.out.println("\n\n");
//}
////----------------------------------------------------------------- 
//
//public static void searchByAuthor(){
//    System.out.println("Enter your Author:");
//    String author = sc.nextLine();
//    boolean finded = false;
//    for(Book book : list){
//        if( book.getAuthor().equals(author)){
//            System.out.println("------Finded Found-----");
//            System.out.println(book);
//            System.out.println("------------------------");
//            finded = true;
//        }           
//    }
//    if(finded == false){
//        System.out.println("Finded not found!!Please Try Again!!");
//       
//    }
//     System.out.println("\n\n");
//}
////--------------------------------------------------------------------
//
//public static void searchByYearPublished(){
//    System.out.println("Enter your YearPublished:");
//    String yearPublished = sc.nextLine();
//    boolean finded = false;
//    for(Book book : list){
//        if( book.getYearPublished().equals(yearPublished)){
//            System.out.println("------Finded Found-----");
//            System.out.println(book);
//            System.out.println("------------------------");
//            finded = true;
//        }           
//    }
//    if(finded == false){
//        System.out.println("Finded not found!!Please Try Again!!");
//    }
//     System.out.println("\n\n");
//}
////-------------------------------------------------------------------------
//
//public static void writeToFile(){
//    try {
//        
//    } catch (Exception e) {
//    }
//}
}
