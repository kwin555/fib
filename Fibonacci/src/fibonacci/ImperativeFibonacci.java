package fibonacci;

public class ImperativeFibonacci implements Fibonacci {
  public long evaluate(long position) {
    assertPositionIsValid(position);

    long sum = 1, previousValue = 1;

    for (int i = 1; i < position; i++) {
      long temp = sum;
      sum += previousValue;
      previousValue = temp;
    }

    return sum;
  }
}
