package fibonacci;

import java.util.stream.Stream;

public class FunctionalFibonacci implements Fibonacci {
  public long evaluate(long position) {
    assertPositionIsValid(position);

    return Stream.iterate(new long[]{1, 1},
        series -> new long[]{series[1], series[0] + series[1]})
      .limit(position + 1)
      .map(series -> series[0])
      .skip(position)
      .findFirst()
      .orElse(1L);
  }
}
