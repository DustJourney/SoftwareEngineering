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

    public void PrintAccount() {
        System.out.println("\taccNo: " + getAccNo() +
                "\taccName: " + getAccName() +
                "\tbalance: " + getBalance() );
    }
//以下三个方法是在优化junior的时候添加的，为了让静态工厂方法能够实现，返回的类型由age决定
    public int getAge() {
        return 0;
    }

    public double getMaxAmount() {
        return 0.0;
    }

    public void setAge(int i) {
    }
}