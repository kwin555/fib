import fibonacci.Fibonacci;
import fibonacci.FunctionalFibonacci;

class FunctionalFibonacciTests implements FibonacciTests {
  @Override
  public Fibonacci createFibonacci() {
    return new FunctionalFibonacci();
  }
}
