public class CurrentAccount extends BankAccount {
    private double OVLimit;
    public CurrentAccount(int accNo, String accName, double balance, double OVLimit) {
        super(accNo, accName, balance);
        this.OVLimit = OVLimit;
    }
    public double getOVLimit() {
        return OVLimit;
    }
    public void setOVLimit(double OVLimit){
        this.OVLimit = OVLimit;
    }
    @Override

    public void withdraw(double amount){
        super.withdraw(amount);

    }

}
