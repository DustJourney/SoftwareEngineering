import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testCreate(){
            Student student = new Student ("Jane Smith");
            assertEquals("Jane Smith", student.getName());
            Student student2 = new Student ("Tom Gray");
            assertEquals("Tom Gray", student2.getName());
    }


    void getName() {
    }
}