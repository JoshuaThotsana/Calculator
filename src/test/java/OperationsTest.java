import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {
    Operations operations = new Operations();

    @Test
    void add() {
        assertEquals(6,operations.add(1,2,3),"Does 1+2+3 equal 6");
    }

    @Test
    void multiply() {
        assertEquals(120,operations.multiply(1,2,3,4,5),"Does the product 1,2,3,4,5 equal 120");
    }
}