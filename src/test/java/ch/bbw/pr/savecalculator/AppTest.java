package ch.bbw.pr.savecalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
  /**
   * Rigorous Test :-)
   */
  private SaveCalculator teste;

  @Before
  public void createSavCalculatorTeste() {
    teste = new SaveCalculator();
  }

  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  // 8 Aufgaben Summe
  @Test
  public void testZweiPositiveIsOk01() {
    int value1 = 10;
    int value2 = 20;
    assertEquals(30, teste.summe(value1, value2));
  }

  @Test
  public void testZweiPositiveIsOk02() {
    int value1 = 20;
    int value2 = 20;
    assertEquals(40, teste.summe(value1, value2));
  }

  public void testZweiNegativeIsOk02() {
    int value1 = -10;
    int value2 = -10;
    assertEquals(-20, teste.summe(value1, value2));
  }

  @Test
  public void testZweiNegativeIsOk01() {
    int value1 = -10;
    int value2 = -20;
    assertEquals(-30, teste.summe(value1, value2));
  }

  @Test(expected = ArithmeticException.class)
  public void testIndexOutOfBoundsException() {
    int value1 = Integer.MAX_VALUE;
    int value2 = 20;
    assertEquals(30, teste.summe(value1, value2));
  }

  @Test
  public void testZahlmitNull() {
    int value1 = 10;
    int value2 = 0;
    assertEquals(10, teste.summe(value1, value2));
  }

  // hier ist es klar dass es eine exception wirft darum expected
  // MAX
  @Test(expected = ArithmeticException.class)
  public void testMax02() {
    int value1 = 10;
    int value2 = Integer.MAX_VALUE;
    teste.summe(value1, value2);
  }

  // MIN
  @Test
  public void TestMinimum() {
    int value1 = Integer.MIN_VALUE;
    int value2 = 20;
    teste.summe(value1, value2);
  }

  // 8 Aufgabe Substraktion
  @Test
  public void testZweiNegativeIstOk() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = -10;
    int value2 = -20;
    assertEquals(10, teste.subtraktion(value1, value2));
  }
  @Test
  public void testZweiNegativeIstOk02() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = -5;
    int value2 = -6;
    assertEquals(1, teste.subtraktion(value1, value2));
  }
  @Test
  public void testZweiPositiveIstOk() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = 5;
    int value2 = 6;
    assertEquals(-1, teste.subtraktion(value1, value2));
  }
  @Test
  public void testZweiPositiveIstOk02() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = 10;
    int value2 = 5;
    assertEquals(5, teste.subtraktion(value1, value2));
  }


  // 8 Aufgabe Division

  // "Setter und Getter":
  // Most of the time, get/set methods just can't break, and if they can't break,
  // then why test them? While it is usually better to test more, there
  // is a definite curve of diminishing returns on test effort versus "code
  // coverage". Remember the maxim: "Test until fear turns to boredom."
  // Setter und Getter sind nicht nötig

  // gib die unexpected exception
  // @Test
  // public void testunexpected() {
  // int value1 = Integer.MAX_VALUE;
  // int value2 = 20;
  // assertEquals(30, teste.summe(value1, value2));
  // }

  // Aufgabe Sichbarkeit
  // private methode geht nicht weil man sie nicht aufrufen kann.
  // @Test
  // public void TestPrivate() {
  // SaveCalculator teste = new SaveCalculator();
  // int value1 = 10;
  // int value2 = 20;
  // assertEquals(-10, teste.multiplikationprivate(value1, value2));
  // }
  // protected method, geht
  // @Test
  // public void TestProtected() {
  // SaveCalculator teste = new SaveCalculator();
  // int value1 = 10;
  // int value2 = 20;
  // assertEquals(-10, teste.multiplikationprivateprotected(value1, value2));
  // }
  // public method
  @Test
  public void TestPublic01() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = 10;
    int value2 = 20;
    assertEquals(-10, teste.subtraktion02(value1, value2));
  }

  @Test
  public void TestPackageProtected() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = 10;
    int value2 = 20;
    assertEquals(-10, teste.subtraktion03(value1, value2));
  }

}
