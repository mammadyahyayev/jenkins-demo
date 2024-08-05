package az.caspian.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void testAdd() {
    assertEquals(10, Calculator.add(6, 4));
  }

}