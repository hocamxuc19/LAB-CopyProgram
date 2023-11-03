/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Vadication {
   // --------------------------------------------------------------------------
    public String checkDate(String input) throws Exception{
        String temp = input.trim();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        try {
            Date date1 = dateFormat.parse(temp);
            return temp;
        } catch (ParseException e) {
            return null;

        }
    }
//------------------------------------------------------------------------------
}
