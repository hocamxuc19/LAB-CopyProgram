/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC
 */
public class BaitapIO {
    private static List<student> list = new ArrayList<>(0);
    

   
    public static void main(String[] args) {
        
        
    }
    
    
    public void writeFile() throws IOException
    {
        FileWriter fw = new FileWriter("data.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            
        } catch (Exception e) {
        }
        
        fw.close();
        bw.close();
        
        
    }
    
}
