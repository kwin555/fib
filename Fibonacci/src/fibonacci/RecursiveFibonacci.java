package fibonacci;

public class RecursiveFibonacci implements Fibonacci {
  public long evaluate(long position) {
    assertPositionIsValid(position);

    if (position < 2) {
      return 1L;
    }

    return evaluate(position - 1) + evaluate(position - 2);
  }
}
