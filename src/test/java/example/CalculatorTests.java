package example;

import org.junit.FixMethodOrder;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTests {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals( 7.0, calculator.summ(3.0, 4.0), 1);
        assertTrue( "",calculator.summ(4, 5)>0);
    }

    @Test
    public void testMul(){
        Calculator calculator = new Calculator();
    }

}
