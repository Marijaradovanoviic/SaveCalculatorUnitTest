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
  @Test
  public void SubstraktionMax01() {
    int value1 = 10;
    int value2 = Integer.MAX_VALUE;
    teste.subtraktion(value1, value2);
  }
  @Test(expected = ArithmeticException.class)
  public void SubstraktionMin01() {
    int value1 = 10;
    int value2 = Integer.MIN_VALUE;
    teste.subtraktion(value1, value2);
  }
  @Test
  public void testSubtraktionZahlmitNull() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = 10;
    int value2 = 0;
    assertEquals(10, teste.subtraktion(value1, value2));
  }
  @Test
  public void testeeinePositiveundNegative01() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = 10;
    int value2 = -5;
    assertEquals(15, teste.subtraktion(value1, value2));
  }

  // 8 Aufgabe Division

  @Test
  public void testDivisionZweiNegativeIstOk() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = -30;
    int value2 = -15;
    assertEquals(2, teste.division(value1, value2));
  }
  @Test
  public void testDivisionZweiNegativeIstOk02() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = -20;
    int value2 = -5;
    assertEquals(4, teste.division(value1, value2));
  }
  @Test
  public void testDivisionZweiPositiveIstOk() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = 44;
    int value2 = 4;
    assertEquals(11, teste.division(value1, value2));
  }
  @Test
  public void testDivisionZweiPositiveIstOk02() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = 10;
    int value2 = 5;
    assertEquals(2, teste.division(value1, value2));
  }
  @Test
  public void DivisionMax01() {
    int value1 = 10;
    int value2 = Integer.MAX_VALUE;
    teste.division(value1, value2);
  }
  @Test
  public void DivisionMin01() {
    int value1 = 10;
    int value2 = Integer.MIN_VALUE;
    teste.division(value1, value2);
  }
  @Test(expected = ArithmeticException.class)
  public void testDivisionZahlmitNull() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = 10;
    int value2 = 0;
    assertEquals(10, teste.division(value1, value2));
  }
  @Test
  public void testeDivivioneinePositiveundNegative01() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = 10;
    int value2 = -5;
    assertEquals(-2, teste.division(value1, value2));
  }
//Multiplikation
@Test
public void testMultiplikationZweiNegativeIstOk() {
  SaveCalculator teste = new SaveCalculator();
  int value1 = 5;
  int value2 = 5;
  assertEquals(25, teste.multiplikation(value1, value2));
}
@Test
public void testMultiplikationZweiNegativeIstOk02() {
  SaveCalculator teste = new SaveCalculator();
  int value1 = 20;
  int value2 = 5;
  assertEquals(100, teste.multiplikation(value1, value2));
}
@Test
public void testMultiplikationZweiPositiveIstOk() {
  SaveCalculator teste = new SaveCalculator();
  int value1 = -2;
  int value2 = -2;
  assertEquals(4, teste.multiplikation(value1, value2));
}
@Test
public void testMultiplikationZweiPositiveIstOk02() {
  SaveCalculator teste = new SaveCalculator();
  int value1 = -10;
  int value2 = -5;
  assertEquals(50, teste.multiplikation(value1, value2));
}
@Test(expected = ArithmeticException.class)
public void MultiplikationMax01() {
  int value1 = 10;
  int value2 = Integer.MAX_VALUE;
  teste.multiplikation(value1, value2);
}
@Test(expected = ArithmeticException.class)
public void MultiplikationMin01() {
  int value1 = 10;
  int value2 = Integer.MIN_VALUE;
  teste.multiplikation(value1, value2);
}
@Test
public void testMultiplikationZahlmitNull() {
  SaveCalculator teste = new SaveCalculator();
  int value1 = 10;
  int value2 = 0;
  assertEquals(0, teste.multiplikation(value1, value2));
}
@Test
public void testeMultiplikationeinePositiveundNegative01() {
  SaveCalculator teste = new SaveCalculator();
  int value1 = 10;
  int value2 = -5;
  assertEquals(-50, teste.multiplikation(value1, value2));
}

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
  // protected method, geht. Die unterschiedlichen Stufen regeln die Sichtbarkeit von Membern einer Klasse (Instanzvariablen und Methoden).Sie legen fest, in welchem Maß Code außerhalb der Klasse darauf zugreifen kann.
  //Die Zugriffsstufe protected erlaubt also den Zugriff auf Instanzvariablen und Methoden für die eigene Klasse, für Klassen im selben package und darüber hinaus in vererbten Klassen, auch wenn sie in einem 
  //anderem package sind:
  @Test
  public void Protected() {
  SaveCalculator teste = new SaveCalculator();
  int value1 = 1;
  int value2 = 2;
  assertEquals(2, teste.Protected(value1, value2));
  }
  // public method geht, überall zugreifbar
  @Test
  public void TestPublic01() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = 10;
    int value2 = 20;
    assertEquals(-10, teste.subtraktion(value1, value2));
  }
  //Package Protected Methode geht. Die unterschiedlichen Stufen regeln die 
  //Sichtbarkeit von Membern einer Klasse (Instanzvariablen und Methoden). Sie legen fest, in welchem Maß Code außerhalb der Klasse darauf zugreifen kann.
  //Die Zugriffsstufe protected erlaubt also den Zugriff auf Instanzvariablen und Methoden für die eigene Klasse, für Klassen im selben package und darüber 
  //hinaus in vererbten Klassen, auch wenn sie in einem anderem package sind:
  @Test
  public void TestPackageProtected() {
    SaveCalculator teste = new SaveCalculator();
    int value1 = 10;
    int value2 = 20;
    assertEquals(-10, teste.PackageProtected(value1, value2));
  }

}
