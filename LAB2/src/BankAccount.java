public class BankAccount {
    private int accNo = 00000;
    private String accName = "aaa";
    private double balance = 0.0;
    private boolean SuspendState = false;
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
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
        System.out.print("successfully withdraw: " + amount
                + " balance: " + this.getBalance());
    }

    public boolean isSuspendState() {
        return SuspendState;
    }
    public void setSuspendState(boolean suspendState) {
        SuspendState = suspendState;
    }
}