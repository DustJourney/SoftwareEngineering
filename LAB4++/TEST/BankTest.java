import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private Bank B;
    @Test
    public void setB(){
        B = new Bank();
        BankAccount A1 = new BankAccount(12345,"张三",1000);
        B.OpenNewAccount(A1);
        BankAccount A2 = new CurrentAccount(67890,"李四",2000,500);
        B.OpenNewAccount(A2);
        BankAccount A3 = new JuniorAccount(38882,"vivi",2000,15);
        B.OpenNewAccount(A3);

        assertFalse(B.InSuspend(12345));
        B.SuspendAccount(12345);
        assertTrue(B.InSuspend(12345));

        B.withdraw(67890,2500);
        assertEquals(-500,B.CheckBalance(67890));
        B.deposit(67890,1000);
        assertEquals(500,B.CheckBalance(67890));

        B.PrintAccounts();


    }


}