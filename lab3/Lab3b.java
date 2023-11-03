package lab03;

import java.util.Scanner;
public class Lab3b {
     public static void main(String[] args){
     Person p = new Person();
     p = ScanInfor();
         PrintfInfor(p);
     }
     public static Person ScanInfor(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID :");
       int id = sc.nextInt();
        System.out.println("Enter Name");
        sc.nextLine();
       String name = sc.nextLine();
        System.out.println("Enter gender");
       boolean gender = sc.nextBoolean();
       return new Person(id,name,gender);
    }
    public static void PrintfInfor(Person p){
            System.out.println("-----------------------------");
            System.out.println("| ID | Name | Male |");
            System.out.printf("| %d | %s | %b |\n",p.getId(), p.getName(), p.getGender());
    
    }
}
