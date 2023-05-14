import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    @Test
    public void testCreate(){
        Customer c = new Customer("JS","5-718,BUPT",new GregorianCalendar(2002,03,18));
        assertEquals("JS",c.getName());
        assertEquals("5-718,BUPT",c.getAddress());
        assertEquals(new GregorianCalendar(2002,03,18),c.getDateOdBirth());
    }

}