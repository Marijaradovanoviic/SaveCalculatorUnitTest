package ch.bbw.pr.savecalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    private SaveCalculator teste;
@Before
public void createSavCalculatorTeste() {
    teste = new SaveCalculator();
}
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
public void testZweiPositiveIsOk() {
    int value1 = 10;
    int value2 = 20;
    assertEquals(30, teste.summe(value1, value2));
}

@Test
public void testZweiNegativeIstOk() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = 10;
    int value2 = 20;
    assertEquals(-10, teste.subtraktion(value1, value2));
}
@Test(expected=ArithmeticException.class)
public void testIndexOutOfBoundsException() {
  int value1 = Integer.MAX_VALUE;
  int value2 = 20;
  assertEquals(30, teste.summe(value1, value2));
}

// gib die unexpected exception
// @Test 
// public void testunexpected() {
//   int value1 = Integer.MAX_VALUE;
//   int value2 = 20;
//   assertEquals(30, teste.summe(value1, value2));
// }



}
