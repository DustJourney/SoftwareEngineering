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

//由于构造方法不能返回值，所以无法直接在构造方法中返回新创建的 `BankAccount` 对象。
//一种解决方案是定义一个静态工厂方法来创建 `JuniorAccount` 或 `BankAccount` 对象。
//当 `age >= 16` 时，`createAccount` 方法会创建并返回一个 `BankAccount` 类型的对象；
//否则，它会创建并返回一个 `JuniorAccount` 类型的对象。
    public static BankAccount createAccount(int accNo, String accName, double balance, int age) {
        if (age >= 16) {
            System.out.println("Age must be less than 16. Creating a BankAccount instead.");
            return new BankAccount(accNo, accName, balance);
        } else {
            return new JuniorAccount(accNo, accName, balance, age);
        }
    }
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
            double D = MaxAmount -DailyWithdraw;
            System.out.println("Daily Withdraw to less: "+ D +" fail to withdraw\n");
        }else if (this.getBalance() >= amount){
            super.withdraw(amount);
            DailyWithdraw += amount;
            System.out.println(" DailyWithdraw has used: " + DailyWithdraw);
        }else {
            System.out.print(" balance is less: "+ this.getBalance() + " fail to withdraw\n");
        }
    }
    public void PrintAccount(){
        System.out.println("\taccNo: " + getAccNo() +
                "\taccName: " + getAccName() +
                "\tbalance: " + getBalance() +
                "\tage: " + getAge());
    }

}
