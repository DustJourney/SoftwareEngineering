import java.util.ArrayList;


public class Bank {
    private ArrayList<BankAccount> BKAC = new ArrayList<BankAccount>();
//    private ArrayList<CurrentAccount> CRAC = new ArrayList<CurrentAccount>();
//    不需要，因为已经继承了，可以存进去，这是多态的表现之一

    public Bank() {

    }

    public boolean InSuspend(int accNo){
        for (BankAccount account : BKAC){
            if (account.getAccNo() == accNo){
                if (account.isSuspendState()){
                    System.out.println("the account is suspended\n");
                    return true;
                }else {
//                    System.out.println("the account is not suspended\n");
                }
            }
        }return false;
    }

    public boolean SuspendAccount(int accNo){
        for (BankAccount account : BKAC){
            if (account.getAccNo() == accNo) {
                account.setSuspendState(true);
            }
        }return true;
    }

    public void OpenNewAccount(BankAccount newAccount) {
        BKAC.add(newAccount);
    }

    public void CloseAccount(int accNo) {
        if (!InSuspend(accNo)){
            for (int i = 0; i < BKAC.size(); i++) {
                if (BKAC.get(i).getAccNo() == accNo) {
                    BKAC.remove(i);
                    break;
                }
            }
        }

    }
    public void deposit(int accNo, double amount) {
        if (!InSuspend(accNo)) {
            for (BankAccount account : BKAC) {
                if (account.getAccNo() == accNo) {
                    account.deposit(amount);
                    System.out.println("successfully deposit: "+amount + " balance: " + account.getBalance());
                    if (account instanceof CurrentAccount) {
                        CurrentAccount currentAccount = (CurrentAccount) account;
                        System.out.println("accno: " + currentAccount.getAccNo()
                                + "OVL: " + currentAccount.getOVLimit());
                    }
                    break;
                }
            }
        }
    }
    public void withdraw(int accNo, double amount) {
        if (!InSuspend(accNo)) {
            for (BankAccount account : BKAC) {
                if (account.getAccNo() == accNo) {
                    account.withdraw(amount);
                    System.out.println("");

//                    if (account.getBalance() < amount) {
//                        if (account instanceof CurrentAccount) {
//                            CurrentAccount currentAccount = (CurrentAccount) account;
//                            if (currentAccount.getOVLimit() >= amount - account.getBalance()) {
//                                account.withdraw(amount);
//                                currentAccount.setOVLimit(currentAccount.getOVLimit() - amount);
//                                System.out.println("successfully withdraw: " + amount
//                                        + " balance: " + currentAccount.getBalance()
//                                        + " ovl: " + currentAccount.getOVLimit());
//                            } else {
//                                System.out.println("OVL and balance are used up, fail to withdraw\n");
//                            }
//                            //强制转换为cur类型
//                        } else {
//                            System.out.println("balance is used up, fail to withdraw\n");
//                        }
//                    } else {
//                        if (account instanceof CurrentAccount){
//                            CurrentAccount currentAccount = (CurrentAccount) account;
//                            account.withdraw(amount);
//                            System.out.println("successfully withdraw: " + amount
//                                    + " balance: " + account.getBalance()
//                                    + " ovl: " + currentAccount.getOVLimit());
//                        }else {
//                            account.withdraw(amount);
//                            System.out.println("successfully withdraw: " + amount
//                                    + " balance: " + account.getBalance());
//                        }
//
//
//                    }
//
//                    break;
                }
            }
        }
    }
    public double CheckBalance(int accNo) {
        if (!InSuspend(accNo)) {
            for (BankAccount account : BKAC) {
                if (account.getAccNo() == accNo) {
                    return account.getBalance();
                }
            }

        }return 0;
    }
//    arraylist里的数据
    public void PrintAccounts(){
        for (BankAccount account : BKAC){
            account.PrintAccount();
        }
    }

}
