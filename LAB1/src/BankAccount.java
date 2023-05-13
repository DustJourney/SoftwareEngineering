import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    private int accNo;
    private String accName;
    private double balance;
    public BankAccount(int accNo, String accName, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
    }
    public int getAccNo() {
        return accNo;
    }
    public String getAccName() {
        return accName;
    }
    public double getBalance() {
        return balance;
    } public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
}