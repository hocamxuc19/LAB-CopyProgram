/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controller;

import Model.Vaccin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class VaccinManager {
     private static List<Vaccin> List = new ArrayList<>();
     private static Scanner sc = new Scanner(System.in);
     
    // -------------------------------------------------------------
//     public void readFroomFile(String fileName){
//         try {
//            FileReader fr = new FileReader("src/Resource/"+fileName+".txt");
//            BufferedReader br= new BufferedReader(fr);
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] arr = line.split(",");
//
//                String code = arr[0];
//                String name = arr[1];
//                String quantity = Integer.parseInt(arr[2]);
//                Date expirationDate = Date.parse(arr[3]);
//                double price = arr[4];
//                String lastInjectedDate = arr[5];
//                
//                Vaccin vc = new Vaccin(code, name, quantity, expirationDate, 0, lastInjectedDate);
//                List.add(vc);
//            }
//            fr.close();
//            br.close();
//            System.out.println("Import successful.");
//        } catch (IOException e) {
//            System.out.println("File does not exist.");
//        }
//     }
     //-----------------------------------------------------------------------
     
     public  void displayAllVaccines() {
        int count = 0;
        System.out.println("==========================");
        System.out.println("----DisplayAllVaccines----");
        System.out.println("==========================");

        for (Vaccin va : List) {
            System.out.println(va);
            count++;
        }
        System.out.println("-------------");
        System.out.println("total:" + count + "Vaccin(s)");

    }
   //  -------------------------------------------------------------------------
     
     public void deleteCustomer(String code) {
        // Find the index of the customer with the matching ID
        int index = -1;
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).getCode().equals(code)) {
                index = i;
                break;
            }
        }
        // If the customer was found, remove them from the list
        if (index != -1) {
            List.remove(index);
            System.out.println("Vaccine deleted successfully.");
        } else {
            System.out.println("Vaccine not found.");
        }
    }
     
    // ---------------------------------------------------------------------------
     
     public void sortVaccineByName() {
        sc.nextLine();
        String name = sc.nextLine();
        boolean finded = false;
        for (Vaccin v : List) {
            if (v.getName().equals(name)) {
                System.out.println("-----Vaccine found-----");
                System.out.println(v);
                finded = true;
            }
        }   
        if (finded == false) {
            System.out.println("---> No Vaccine was found!!!\\n\\n");

        }
        System.out.println("\n\n");

    }
    // --------------------------------------------------------------------------
     public boolean saveVaccineFile(String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream("src/Resource/"+fileName+".txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            for (Vaccin t : this.List) {
                String line = t.getCode()+ "," + t.getName()+ "," + t.getQuantity()+ "," + t.getExpirationDate()+","+t.getPrice()+','+t.getLastInjectedDate();
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
     
  //  ----------------------------------------------------------------------------
     
     public void addnewVaccine() {
        Vaccin n = new Vaccin();

        System.out.println("Enter code:");
        n.setCode(sc.nextLine());

        System.out.println("Enter Name:");
        n.setName(sc.nextLine());
         
        System.out.println("Enter quantity:");
        n.setQuantity(sc.nextInt());
                
        System.out.println("Enter expirationDate:");
        n.setExpirationDate(Date.from(Instant.MIN));

        System.out.println("Enter price:");
        n.setPrice(sc.nextDouble());
        
        System.out.println("Enter lastInjectedDate:");
        n.setLastInjectedDate(Date.from(Instant.MIN));
                                     
        List.add(n);

    }
}
