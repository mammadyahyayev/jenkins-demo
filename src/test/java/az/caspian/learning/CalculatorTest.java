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
    assertEquals(0, Calculator.absolute(2));
    assertEquals(5, Calculator.absolute(5));
  }

}