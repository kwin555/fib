import fibonacci.Fibonacci;
import fibonacci.RecursiveFibonacci;

class RecursiveFibonacciTest implements FibonacciTests {
  @Override
  public Fibonacci createFibonacci() {
    return new RecursiveFibonacci();
  }
}
