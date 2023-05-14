import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JuniorAccountTest {
    private Bank B;
    private BankAccount JA;

    @BeforeEach
    public void setJA(){
        JA = JuniorAccount.createAccount(66666,"testjunior",500,15);
        BankAccount JA2 = JuniorAccount.createAccount(77777,"failtest",1000,16);

    }

    @Test
    public void TestCreate(){

        assertEquals(66666,JA.getAccNo());
        assertEquals("testjunior",JA.getAccName());
        assertEquals(500,JA.getBalance());
        assertEquals(15,JA.getAge());
        assertEquals(100,JA.getMaxAmount());

        JA.setAge(14);
        assertEquals(14,JA.getAge());

        assertFalse(JA.isSuspendState());

        JA.withdraw(500);
        assertEquals(500,JA.getBalance());

        JA.withdraw(100);
        assertEquals(400,JA.getBalance());

        JA.deposit(500);
        assertEquals(900,JA.getBalance());

        JA.setSuspendState(true);
        assertTrue(JA.isSuspendState());

    }


}