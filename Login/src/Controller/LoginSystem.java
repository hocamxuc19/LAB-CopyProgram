/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.LoginRepository;
import View.Menu;
import java.util.Locale;

/**
 *
 * @author Xuan Vinh
 */
public class LoginSystem extends Menu<String>{
    static String[] mc = {"Vietnamese", "English", "Exit"};
    LoginRepository program;
    Locale vietnamese = new Locale("Vi");
    Locale english = Locale.ENGLISH;
    public LoginSystem() {
        super("\nLogin Program", mc);
        program = new LoginRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.login(vietnamese);
                break;
            case 2:
                program.login(english);
                break;
            case 3:
                System.exit(0);
        }
    }
    
}