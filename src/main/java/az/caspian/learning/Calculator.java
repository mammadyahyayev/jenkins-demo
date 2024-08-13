package az.caspian.learning;

public final class Calculator {

  public static int add(int a, int b) {
    return a + b;
  }

  public static int absolute(int a) {
    return Math.abs(a);
  }

  public static int divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("Divide by zero is not allowed!");
    }

    return a / b;
  }
}
