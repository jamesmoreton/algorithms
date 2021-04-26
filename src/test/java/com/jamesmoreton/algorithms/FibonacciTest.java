package com.jamesmoreton.algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {

  private static Stream<Arguments> data() {
    return Stream.of(
        Arguments.of(0, 0),
        Arguments.of(1, 1),
        Arguments.of(2, 1),
        Arguments.of(3, 2),
        Arguments.of(4, 3),
        Arguments.of(5, 5),
        Arguments.of(6, 8),
        Arguments.of(7, 13),
        Arguments.of(8, 21),
        Arguments.of(9, 34),
        Arguments.of(10, 55)
    );
  }

  @ParameterizedTest
  @MethodSource("data")
  void fib(int n, int expected) {
    assertThat(Fibonacci.fib(n)).isEqualTo(expected);
  }

  @ParameterizedTest
  @MethodSource("data")
  void fibIter(int n, int expected) {
    assertThat(Fibonacci.fibIter(n)).isEqualTo(expected);
  }
}