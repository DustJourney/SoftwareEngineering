import java.time.LocalDate;

public class JuniorAccount extends BankAccount{
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private int age;

    public double getMaxAmount() {
        return MaxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        MaxAmount = maxAmount;
    }

    private double MaxAmount = 100.0;

    private double DailyWithdraw = 0;
    private LocalDate LastWithdrawDate;
//根据时间判断数据更新
    public JuniorAccount(int accNo, String accName, double balance, int age) {
        super(accNo, accName, balance);
        if (age >= 16) {
            System.out.println("Age must be less than 16");
        } else {
            this.age = age;
            this.LastWithdrawDate = LocalDate.now();
        }
    }
    @Override
    public void withdraw(double amount){
        LocalDate CurrentDate = LocalDate.now();

        if (!CurrentDate.isEqual(LastWithdrawDate)){
            DailyWithdraw = 0;
            LastWithdrawDate = CurrentDate;
        }
        if (DailyWithdraw + amount > MaxAmount){
            System.out.println("Daily Withdraw to less: "+ DailyWithdraw +" fail to withdraw\n");
        }else if (this.getBalance() >= amount){
            super.withdraw(amount);
            DailyWithdraw += amount;
            System.out.println(" DailyWithdraw has used: " + DailyWithdraw);
        }else {
            System.out.print(" balance is less: "+ this.getBalance() + " fail to withdraw\n");
        }
    }

}
