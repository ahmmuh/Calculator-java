import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    void add() {
        Cal cal = new Cal(2,3);
        assertEquals(5,cal.getNum1() + cal.getNum2());
    }

    @Test
    void multiply() {
        Cal cal = new Cal(2,3);
        assertEquals(6,cal.getNum1() * cal.getNum2());
    }

    @Test
    void subtract() {
        Cal cal = new Cal(4,3);
        assertEquals(1,cal.getNum1() - cal.getNum2());
    }

    @Test
    void divide() {
        Cal cal = new Cal(6,3);
        assertEquals(2,cal.getNum1() / cal.getNum2());
    }
}