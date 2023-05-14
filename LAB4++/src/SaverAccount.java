public class SaverAccount extends BankAccount{
    public SaverAccount(int accNo, String accName, double balance){
        super(accNo,accName,balance);
    }
    @Override
    public void withdraw(double amount){
        System.out.println("the saveraccount can't withdraw!");
    }
}
