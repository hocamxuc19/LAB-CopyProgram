import java.util.Scanner;

public class test 
{
    public static void main (String[] args)
    {
       float d;
       float h;
       Scanner i= new Scanner(System.in);
       System.out.println("Nhap d va nhap h:");
       d=i.nextFloat();
       h=i.nextFloat();
       if (d<=0 || h<=0 )
       {
        System.out.println("Khong du dieu kien de tinh s.");
       }
       else
       {
        System.out.println("dien tich cua tam giac la:"+ (d*h/2));
       }
       

    //    System.out.println("Dien tich tam giac la : "+ (d*h/2));
    //  i.close();
    //   System.out.println(" Enter your name:");
    //   String yourName= i.nextLine();
    //   System.out.println("Welcome "+yourName+" to Java"); 
    }    
    
}