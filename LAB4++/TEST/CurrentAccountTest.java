import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrentAccountTest {
    private Bank B;
    private CurrentAccount CA;

    @BeforeEach
    public void setCA(){
        CA = new CurrentAccount(88888, "testCA", 10000, 500);
    }

    @Test
    public void TestCreate(){

        assertEquals(88888,CA.getAccNo());
        assertEquals("testCA",CA.getAccName());
        assertEquals(10000,CA.getBalance());
        assertEquals(500,CA.getOVLimit());

        CA.setOVLimit(600);
        assertEquals(600,CA.getOVLimit());

        assertFalse(CA.isSuspendState());

        CA.withdraw(5000);
        assertEquals(5000,CA.getBalance());

        CA.deposit(500);
        assertEquals(5500,CA.getBalance());

        CA.withdraw(6000);
        assertEquals(-500,CA.getBalance());

        CA.withdraw(200);
        assertEquals(-500,CA.getBalance());

        CA.setSuspendState(true);
        assertTrue(CA.isSuspendState());

    }

}