import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bank B = new Bank();
        BankAccount A1 = new BankAccount(00000,"InitialAccount",0);
        B.OpenNewAccount(A1);

        for (int i = 0; i==0 ;){
//       便于返回该界面
            System.out.println("\nplease choose the option following: ");
            System.out.println("A 存款deposit\n" +
                    "B 取款withdraw\n" +
                    "C 查询余额display\n" +
                    "D 建户open_new\n" +
                    "E 销户close_account\n" +
                    "F 查询所有账户printAccount\n");
            Scanner scan = new Scanner(System.in);
            String OptionNo = "D";
            OptionNo =scan.next();
            System.out.println("you enter and choose : \n" + OptionNo);

            if ("A".equals(OptionNo)){
                System.out.println("\nplease enter the account you want to deposit : ");
                int accNo = scan.nextInt();
                System.out.println("\nplease enter the amount you want to deposit : ");
                double amount = scan.nextDouble();
                System.out.println("you enter : \n" + amount);
                B.deposit(accNo,amount);

                B.BackToInterface(i);
            } else if ("B".equals(OptionNo)) {
                System.out.println("\nplease enter the account you want to withdraw : ");
                int accNo = scan.nextInt();
                System.out.println("\nplease enter the amount you want to withdraw : ");
                double amount = Double.parseDouble(scan.next());
                System.out.println("you enter : \n" + amount);
                B.withdraw(accNo,amount);

                B.BackToInterface(i);
            } else if ("C".equals(OptionNo)) {
                System.out.println("\nplease enter the account you want to check : ");
                int accNo = scan.nextInt();
                double balance = B.CheckBalance(accNo);
                System.out.println("\n" + balance );

                B.BackToInterface(i);

            } else if ("D".equals(OptionNo)) {
                System.out.println("\nplease choose the account you want to open : \n"
                                + "A SaverAccount\t" + "B JuniorAccount\t" + "C CurrentAccount"
                        );
                String OpenType = "D";
                OpenType = scan.next();

                if ("A".equals(OpenType)){
                    System.out.println("you enter " + OpenType + "and choose SaverAccount" );

                    System.out.println("PLEASE enter the accNumber : ");
                    int accNo = scan.nextInt();
                    System.out.println("PLEASE enter the accName : ");
                    String accName = scan.next();
                    System.out.println("PLEASE enter the balance : ");
                    double balance = scan.nextDouble();

                    BankAccount account = new SaverAccount(accNo,accName, balance);
                    B.OpenNewAccount(account);
                    B.BackToInterface(i);

                } else if ("B".equals(OpenType)) {
                    System.out.println("you enter " + OpenType + "and choose JuniorAccount" );

                    System.out.println("PLEASE enter the accNumber : ");
                    int accNo = scan.nextInt();
                    System.out.println("PLEASE enter the accName : ");
                    String accName = scan.next();
                    System.out.println("PLEASE enter the balance : ");
                    double balance = scan.nextDouble();
                    System.out.println("PLEASE enter the age : ");
                    int age = scan.nextInt();

                    BankAccount account = new JuniorAccount(accNo,accName, balance,age);
                    B.OpenNewAccount(account);
                    B.BackToInterface(i);

                } else if ("C".equals(OpenType)) {
                    System.out.println("you enter " + OpenType + "and choose CurrentAccount" );

                    System.out.println("PLEASE enter the accNumber : ");
                    int accNo = scan.nextInt();
                    System.out.println("PLEASE enter the accName : ");
                    String accName = scan.next();
                    System.out.println("PLEASE enter the balance : ");
                    double balance = scan.nextDouble();
                    System.out.println("PLEASE enter the OverdraftLimit : ");
                    double ovlimit = scan.nextDouble();

                    BankAccount account = new CurrentAccount(accNo,accName, balance,ovlimit);
                    B.OpenNewAccount(account);
                    B.BackToInterface(i);

                }else{
                    System.out.println("\nplease enter the correct OpenType : ");
                    B.BackToInterface(i);
                }

            } else if ("E".equals(OptionNo)) {
                System.out.println("\nplease enter the account you want to close : ");
                int accNo = scan.nextInt();
                B.CloseAccount(accNo);

                B.BackToInterface(i);
            } else if ("F".equals(OptionNo)) {
                B.PrintAccounts();

                B.BackToInterface(i);
            } else {
                System.out.println("\nplease enter the correct optionNo : ");
                B.BackToInterface(i);
            }
        }


    }
}