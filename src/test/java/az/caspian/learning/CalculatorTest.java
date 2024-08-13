package az.caspian.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void testAdd() {
    assertEquals(10, Calculator.add(6, 4));
  }

  @Test
  void testAbsolute() {
    assertEquals(5, Calculator.absolute(-5));
    assertEquals(0, Calculator.absolute(0));
    assertEquals(5, Calculator.absolute(5));
  }

  @Test
  void testExceptionThrownWhenDividingByZero() {
    assertThrows(ArithmeticException.class, () -> {
      Calculator.divide(4, 0);
    });
  }

  @Test
  void testDivision() {
    assertEquals(2, Calculator.divide(4, 2));
  }

}