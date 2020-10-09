import fibonacci.Fibonacci;
import fibonacci.MemoizationFibonacci;
import fibonacci.RecursiveFibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MemoizationFibonacciTest implements FibonacciTests {
  @Override
  public Fibonacci createFibonacci() {
    return new MemoizationFibonacci();
  }

  double getTimeDeltaFromFibonacciTest(Fibonacci fibonacci) {
    double startTime = System.currentTimeMillis();
    fibonacci.evaluate(40);
    double endTime = System.currentTimeMillis();
    return Math.abs(endTime - startTime);
  }

  @Test
  void performanceTestEnsuresMemoizationIsOrderMagnitudeLarger() {
    assertTrue(getTimeDeltaFromFibonacciTest(new RecursiveFibonacci()) >
      getTimeDeltaFromFibonacciTest(createFibonacci()) * 10);
  }
}
