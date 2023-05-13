public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        int accNo1 = 12345;
        String accName1 = "张三";
        double initialDeposit1 = 1000.0;
        BankAccount account1 = new BankAccount(accNo1, accName1, initialDeposit1);
        bank.OpenNewAccount(account1);

        int accNo2 = 67890;
        String accName2 = "李四";
        double initialDeposit2 = 2000.0;
        double OVLimit2 = 500.0;
        BankAccount account2 = new CurrentAccount(accNo2, accName2, initialDeposit2, OVLimit2);
        bank.OpenNewAccount(account2);

        int accNo3 = 38882;
        String accName3 = "vivi";
        double initialDeposit3 = 2000.0;
        double OVLimit3 = 500.0;
        BankAccount account3 = new CurrentAccount(accNo3, accName3, initialDeposit3, OVLimit3);
        bank.OpenNewAccount(account3);

        bank.deposit(accNo1, 500);
        bank.withdraw(accNo2, 300);
        bank.withdraw(accNo3, 2000);
        bank.withdraw(accNo3, 500);
        bank.withdraw(accNo3, 100);

        double balance1 = bank.CheckBalance(accNo1);
        System.out.println("账户" + accNo1 + "的余额为：" + balance1);

        double balance2 = bank.CheckBalance(accNo2);
        System.out.println("账户" + accNo2 + "的余额为：" + balance2);

        double balance3 = bank.CheckBalance(accNo3);
        System.out.println("账户" + accNo3 + "的余额为：" + balance3);


        bank.PrintAccounts();

        bank.CloseAccount(accNo2);
        bank.PrintAccounts();

        bank.InSuspend(accNo1);
        bank.SuspendAccount(accNo1);
        bank.InSuspend(accNo1);
        bank.withdraw(accNo1, 100);

        BankAccount account5 = new JuniorAccount(22894, "Alice", 200, 15);
        BankAccount account6 = new JuniorAccount(64566, "BALANCE", 13455, 16);
        bank.OpenNewAccount(account5);
        bank.OpenNewAccount(account6);
        account5.withdraw(50);
        System.out.println(" Balance: " + account5.getBalance());
        account5.withdraw(60);
        System.out.println(" Balance: " + account5.getBalance());
        account5.withdraw(10);
        System.out.println(" Balance: " + account5.getBalance());

        bank.PrintAccounts();


    }
}