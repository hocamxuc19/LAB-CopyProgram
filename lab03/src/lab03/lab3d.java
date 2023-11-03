
package lab03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class lab3d {

  private static final ArrayList<Person> perArr = new ArrayList<>();
   private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         perArr.add(new Person(2,"Nguyen van A",true));
        perArr.add(new Person(3,"Nguyen van B",false));  
        add();
        SapXepTen();
        sc.nextLine();
         searchByName();
       
    }
        public static void add(){
        while (perArr.size() < 4){
            Person person = scanfInfo();
            perArr.add(person);
        }
        for(Person person : perArr){
            printInfo(person);
            
        }
     }
         public static void swapIndex(int i, int j){
        Person temp = perArr.get(i);
        perArr.set(i, perArr.get(j));
        perArr.set(j, temp);
    }
         
            public static void SapXepTen(){
        for(int i=0; i<perArr.size()-1; i++){
            for(int j=0; j<perArr.size()-2; j++){
                String firstName = perArr.get(j).getName().toLowerCase();
                String secondName = perArr.get(j+1).getName().toLowerCase();
                if(firstName.compareTo(secondName) > 0){
                    swapIndex(j,j+1); 
            }
        }
        }
        System.out.println(" Danh sach sau khi da sap xep theo ten: ");
        for(Person person : perArr){
            printInfo(person);
        }
    }
                
    public static ArrayList<Person> searchByName(String name) {
    ArrayList<Person> foundPerson = new ArrayList<>();
    for (Person person : perArr) {
        if (person.getName().equalsIgnoreCase(name)) {
            foundPerson.add(person);
        }
    }
    return foundPerson;
    }
            public static void searchByName(){
        System.out.println("Nhap ten can tim kiem: ");
        String nameSearch = sc.nextLine();
        ArrayList<Person> foundPerson = searchByName(nameSearch);
        if(!foundPerson.isEmpty()){
            System.out.println(" Da tim thay" + nameSearch);
            System.out.println("Id | Name | Male");
                for(Person person : foundPerson){
                    printInfo(person);
                }
        }
        else{
            System.out.println("Khong co ai ten" + nameSearch + ".");
        }
    }

    public static Person scanfInfo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ID:");
        int id = input.nextInt();
        System.out.println("Enter Name:");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Enter Gender:");
        boolean gender = input.nextBoolean();
        return new Person(id, name, gender);

    }

    public static void printInfo(Person p) {
        System.out.println("----------------------------------------");
        System.out.println("| ID | Name | Male");
        System.out.println("|" + p.getId() + "|" + p.getName() + "|" + p.getMale() + "|");
    }

}
