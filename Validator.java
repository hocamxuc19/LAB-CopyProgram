package view;

import controller.Company;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private static Set<String> customerIDs = new HashSet<>();
//------------------------------------------------------------------------------

    public static boolean isValidCustomerID(String customerID) {
        return customerID.matches("^KH\\d{2}$");
    }
//------------------------------------------------------------------------------
    
    public static boolean isValidPhone(String phone) {
        return phone.matches("^09\\d{8}$");
    }
//------------------------------------------------------------------------------

    public static boolean isValidDateOfBirth(String dateOfBirth) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            Date dob = dateFormat.parse(dateOfBirth);
            Calendar calendar = Calendar.getInstance();
            calendar.setLenient(false);
            calendar.setTime(dob);

            int year = calendar.get(Calendar.YEAR);
            if (year > 2023) {
                return false;
            }

            int month = calendar.get(Calendar.MONTH) + 1;
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            if (month == 2) {
                return isValidDayInFebruary(day, year);
            } else {
                return isValidDayOfMonth(day, month);
            }
        } catch (ParseException e) {
            return false;
        }
    }
//------------------------------------------------------------------------------

    public static boolean isValidName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]+(\\s[A-Z][a-zA-Z]+)*$");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
//------------------------------------------------------------------------------

    private static boolean isValidDayOfMonth(int day, int month) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return day >= 1 && day <= 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return day >= 1 && day <= 30;
            default:
                return false;
        }
    }
//------------------------------------------------------------------------------

    private static boolean isValidDayInFebruary(int day, int year) {
        if (isLeapYear(year)) {
            return day >= 1 && day <= 29;
        } else {
            return day >= 1 && day <= 28;
        }
    }
//------------------------------------------------------------------------------

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
//------------------------------------------------------------------------------

    public static void addCustomerID(String customerID) {
        customerIDs.add(customerID);
    }
//------------------------------------------------------------------------------

    public static String getValidCustomerID(Scanner sc, Company company) {
        String customerID = sc.nextLine();
        while (!isValidCustomerID(customerID) || company.customerIDExists(customerID)) {
            if (!isValidCustomerID(customerID)) {
                System.out.println("Invalid Customer ID format. Ex: 'KH12'.");
            } else {
                System.out.println("Customer ID already exists. Please enter a different ID.");
            }
            System.out.print("Enter Customer ID: ");
            customerID = sc.nextLine();
        }
        return customerID;
    }
//------------------------------------------------------------------------------
    public static String getValidName(Scanner sc) {
        String name = sc.nextLine();
        while (!isValidName(name)) {
            System.out.println("Invalid Name format. Ex: 'Hoang Hieu Linh'.");
            System.out.print("Enter Name: ");
            name = sc.nextLine();
        }
        return name;
    }
//------------------------------------------------------------------------------
    public static String getValidPhone(Scanner sc) {
        String phone = sc.nextLine();
        while (!isValidPhone(phone)) {
            System.out.println("Invalid Phone format. Ex: '09xxxxxxxx'.");
            System.out.print("Enter new Phone: ");
            phone = sc.nextLine();
        }
        return phone;
    }
//------------------------------------------------------------------------------
    public static Date getValidDateOfBirth(Scanner sc) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateOfBirthStr = sc.nextLine();
        while (!isValidDateOfBirth(dateOfBirthStr)) {
            System.out.println("Invalid Date of Birth format. Ex: '31/12/2000'.");
            System.out.print("Enter new Date of Birth (dd/MM/yyyy): ");
            dateOfBirthStr = sc.nextLine();
        }
        try {
            return dateFormat.parse(dateOfBirthStr);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
            return null;
        }
    }
}
