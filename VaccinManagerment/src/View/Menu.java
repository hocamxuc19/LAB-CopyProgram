package View;

import Controller.VaccinManager;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Menu {
    
    private static VaccinManager hi = new VaccinManager();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("----------------------");
            System.out.println("VACCINE MANAGEMENT SYSTEM");
            System.out.println("----------------------");
            System.out.println("1.Display All Vaccines From File");
            System.out.println("2.Read VaccineData to File");
            System.out.println("3.Add a Vaccine");
            System.out.println("4.Delete a Vaccine by code");
            System.out.println("5.Sort Vaccine by Name");
            System.out.println("6.Save to File ");
            System.out.println("7.Exit");
            System.out.println("Your Choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    sc.nextLine();
                    hi.displayAllVaccines();
                    System.out.println("\n");

                }
                case 2 -> {
                    sc.nextLine();
                    System.out.println("Please Enter File Name");
//                    hi.(sc.nextLine());

                }
                case 3 -> {
                    sc.nextLine();
                    hi.addnewVaccine();

                }
                case 4 -> {
                    sc.nextLine();    
                    System.out.println("Enter Vaccinecode to delete: ");
                    String code = sc.nextLine();
                    hi.deleteCustomer(code);

                }

                case 5 -> {
                    sc.nextLine();
                    System.out.println("Please Enter Name to Sort:");
                    hi.sortVaccineByName();
                }

                case 6 -> {
                    sc.nextLine();
                    System.out.println("Please Enter File Name to save:");
                    hi.saveVaccineFile(sc.nextLine());
                    
                }
                case 7 -> {
                    System.out.println("Thank For use programme");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Thank For use programme");
                }

            }

        } while (choice > 0 && choice <8);

    }

    
}
