import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
//每个测试方法都是单独运行的，意味着每个测试方法都会创建一个新的测试实例而不会受到其他测试的影响
    private Bank B;
    private BankAccount bankAccount;
    @BeforeEach
    //所以要想在测试每个方法前都执行这个方法，就得用这个注解
    public void setUp(){
        B = new Bank();
        bankAccount = new BankAccount(55555, "testname", 50000);
    }
    @Test
    public void TestCreate(){

        assertEquals(55555,bankAccount.getAccNo());
        assertEquals("testname",bankAccount.getAccName());
        assertEquals(50000,bankAccount.getBalance());
        assertFalse(bankAccount.isSuspendState());

        bankAccount.withdraw(500);
        assertEquals(49500,bankAccount.getBalance());

        bankAccount.deposit(500);
        assertEquals(50000,bankAccount.getBalance());

        bankAccount.setSuspendState(true);
        assertTrue(bankAccount.isSuspendState());

    }

}