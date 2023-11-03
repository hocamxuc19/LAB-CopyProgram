
package lab03;

import java.util.Scanner;
import lab03.Person;
public class lab3c {

    
    public static void main(String[] args) {
       Person[] perArr = new Person[4];
       Person p1 = new Person(1,"Nguyen Van A",true);
       Person p2 = new Person(2,"Nguyen Van B",false);
       perArr[0] = p1;
       perArr[1] = p2;
       for(int i =2 ;i<perArr.length;i++){
          perArr[i] = ScanInfor();
       }
        for (Person perArr1 : perArr) {
            PrintfInfor(perArr1);
        }
              
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
