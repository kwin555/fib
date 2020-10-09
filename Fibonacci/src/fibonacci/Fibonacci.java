package fibonacci;

public interface Fibonacci {
  long evaluate(long position);

  default void assertPositionIsValid(long position) {
    if (position < 0) {
      throw new IllegalArgumentException("Negative Positions Invalid");
    }
  }
}
