/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class Employee {
    private String Empid;
    private String Account;
    private String WorkStartingDate;
    private float ProductivityScore;
    private float MonthlyIncome;
    private float RewardSalary;

    public Employee() {
    }

    public Employee(String Empid, String Account, String WorkStartingDate, float ProductivityScore, float MonthlyIncome, float RewardSalary) {
        this.Empid = Empid;
        this.Account = Account;
        this.WorkStartingDate = WorkStartingDate;
        this.ProductivityScore = ProductivityScore;
        this.MonthlyIncome = MonthlyIncome;
        this.RewardSalary = RewardSalary;
    }

    public String getEmpid() {
        return Empid;
    }

    public void setEmpid(String Empid) {
        this.Empid = Empid;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String Account) {
        this.Account = Account;
    }

    public String getWorkStartingDate() {
        return WorkStartingDate;
    }

    public void setWorkStartingDate(String WorkStartingDate) {
        this.WorkStartingDate = WorkStartingDate;
    }

    public float getProductivityScore() {
        return ProductivityScore;
    }

    public void setProductivityScore(float ProductivityScore) {
        this.ProductivityScore = ProductivityScore;
    }

    public float getMonthlyIncome() {
        return MonthlyIncome;
    }

    public void setMonthlyIncome(float MonthlyIncome) {
        this.MonthlyIncome = MonthlyIncome;
    }

    public float getRewardSalary() {
        return RewardSalary;
    }

    public void setRewardSalary(float RewardSalary) {
        this.RewardSalary = RewardSalary;
    }

    @Override
    public String toString() {
        return "Employee{" + "Empid=" + Empid + ", Account=" + Account + ", WorkStartingDate=" + WorkStartingDate + ", ProductivityScore=" + ProductivityScore + ", MonthlyIncome=" + MonthlyIncome + ", RewardSalary=" + RewardSalary + '}';
    }
    
    
    

}
