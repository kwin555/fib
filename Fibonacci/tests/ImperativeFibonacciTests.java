import fibonacci.Fibonacci;
import fibonacci.ImperativeFibonacci;

class ImperativeFibonacciTests implements FibonacciTests {
  @Override
  public Fibonacci createFibonacci() {
    return new ImperativeFibonacci();
  }
}
