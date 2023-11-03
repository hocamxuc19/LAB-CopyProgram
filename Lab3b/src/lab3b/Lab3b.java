import java.util.Scanner;
class Test{

public static void main(String[] args){
Person p=new Person();
p.scanInfo();
p.printInfo();
}
}


public class Lab3b{
    private int id;
    private String name;
    private boolean gender;
    public Lab3b(int id, String name, boolean gender){
        this.id=id;
        this.name=name;
        this.gender=gender;
    }
    public Lab3b(){
    
    }
    public int getID(){
        return this.id;
    }
    public void setID(int value){
        this.id=value;
    }
    public void setName(String value){
        this.name=value;
    }
    public boolean isMale(){
        return this.gender;
    }
    public void setMale(boolean value){
        this.gender = value;
    }
    public void scanInfo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        this.id= input.nextInt();
        input.nextLine();
        System.out.print("Enter Name: ");
        this.name = input.nextLine();
        System.out.print("Enter Gender(true/false): ");
        this.gender = input.nextBoolean();
    }
    public void printInfo(){
        System.out.println("________________________");
        System.out.println("| ID | Name | Male |");
        System.out.printf(" | %d | %s | %b |\n",this.id,this.name,this.gender);
    }
}