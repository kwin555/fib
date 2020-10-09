import fibonacci.Fibonacci;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

interface FibonacciTests {
  abstract Fibonacci createFibonacci();

  default void canary() {
    assertTrue(true);
  }

  @Test
  default void exceptionThrownWhenPositionIsNegative() {
    IllegalArgumentException exception = assertThrows(
      IllegalArgumentException.class, () -> createFibonacci().evaluate(-1));

    assertEquals("Negative Positions Invalid", exception.getMessage());
  }

  @Test
  default void evaluateReturnsCorrectValueAtGivenPosition() {
    Fibonacci fibonacci = createFibonacci();

    assertAll(
      () -> assertEquals(1L, fibonacci.evaluate(0)),
      () -> assertEquals(1L, fibonacci.evaluate(1)),
      () -> assertEquals(2L, fibonacci.evaluate(2)),
      () -> assertEquals(3L, fibonacci.evaluate(3)),
      () -> assertEquals(13L, fibonacci.evaluate(6)),
      () -> assertEquals(21L, fibonacci.evaluate(7)),
      () -> assertEquals(377L, fibonacci.evaluate(13)),
      () -> assertEquals(4807526976L, fibonacci.evaluate(47))
    );
  }
}
