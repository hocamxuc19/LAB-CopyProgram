/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAcess;

import Common.Library;
import Model.User;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Xuan Vinh
 */
public class LoginDAO {  
    private static LoginDAO instance = null;
    Library l;
    List<User> userList;

    public LoginDAO() {
        l = new Library();
        userList = new LinkedList<>();
    }

    public static LoginDAO Instance() {
        if (instance == null) {
            synchronized (LoginDAO.class) {
                if (instance == null) {
                    instance = new LoginDAO();
                }
            }
        }
        return instance;
    }

    public void login(Locale language) {
        l.getWordLanguage(language, "enterAccountNumber");
        int accountNumber = l.checkInputAccount(language);
        l.getWordLanguage(language, "enterPassword");
        String passString = l.checkInputPassword(language);
        System.out.print("Captcha: ");
        String captchaGenerated = l.generateCaptchaText();
        System.out.println(captchaGenerated);
        while (true) {
            if (l.checkInputCaptcha(captchaGenerated, language)) {
                l.getWordLanguage(language, "loginSuccess");
                System.out.println();
                userList.add(new User(accountNumber, passString, captchaGenerated));
                return;
            } else {
                l.getWordLanguage(language, "errCaptchaIncorrect");
                System.out.println("");
            }
        }       
    }
}