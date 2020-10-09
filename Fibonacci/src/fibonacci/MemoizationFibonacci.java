package fibonacci;

import java.util.HashMap;
import java.util.Map;

public class MemoizationFibonacci extends RecursiveFibonacci {
  private static Map<Long, Long> fibonacciCache = new HashMap<>();

  public long evaluate(long position) {
    if (!fibonacciCache.containsKey(position)) {
      fibonacciCache.put(position, super.evaluate(position));
    }

    return fibonacciCache.get(position);
  }
}
