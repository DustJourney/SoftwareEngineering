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

    public void withdraw(double amount) {
        if (this.getBalance() <= 0){
            System.out.println("balance is used up: " + this.getBalance());

        }
        if (amount >= this.getBalance()) {
            if (OVLimit >= amount - this.getBalance()) {
                super.withdraw(amount);
                if (this.getBalance() < 0) {
                    OVLimit = OVLimit + this.getBalance();
                }
                System.out.print(" ovl: " + this.getOVLimit());
            } else {
                System.out.print("OVL is used up, fail to withdraw\n");
            }
        }else {
            super.withdraw(amount);
            System.out.print(" ovl: " + this.getOVLimit());
        }
    }

    public void PrintAccount(){
        System.out.println("\taccNo: " + getAccNo() +
                "\taccName: " + getAccName() +
                "\tbalance: " + getBalance() +
                "\toverdraft limit: " + getOVLimit());
    }

}
