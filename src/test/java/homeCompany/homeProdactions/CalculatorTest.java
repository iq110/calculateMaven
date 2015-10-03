package homeCompany.homeProdactions;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    /**
     * plus test
     *
     * @throws Exception
     */
    @Test
    public void testAdd() throws Exception {
        Calculator calc = new Calculator();
        calc.add(2, 10);
        assertEquals(12, calc.getResult());
    }

    /**
     * substraction test
     *
     * @throws Exception
     */
    @Test
    public void testMinus() throws Exception {
        Calculator calc = new Calculator();
        calc.minus(2, 10);
        assertEquals(-8, calc.getResult());
    }

    /**
     * multiply test
     * @throws Exception
     */
    @Test
    public void testMultiply() throws Exception {
        Calculator calc  = new Calculator();
        calc.multiply(2, 10);
        assertEquals(20, calc.getResult());
    }

    /**
     * division test
     * @throws Exception
     */
    @Test
    public void testDiv() throws Exception {
        Calculator calc  = new Calculator();
        calc.div(2, 10);
        assertEquals(0, calc.getResult());
    }

    /**
     * involution test
     * @throws Exception
     */
    @Test
    public void testPow() throws Exception {
        Calculator calc  = new Calculator();
        calc.add(2,2);
        assertEquals(4, calc.getResult());
    }
}