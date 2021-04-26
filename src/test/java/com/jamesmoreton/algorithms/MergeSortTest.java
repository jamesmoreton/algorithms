package com.jamesmoreton.algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortTest {

  private static Stream<Arguments> data() {
    return Stream.of(
        Arguments.of(new int[]{}, new int[]{}),
        Arguments.of(new int[]{8}, new int[]{8}),
        Arguments.of(new int[]{9, 3}, new int[]{3, 9}),
        Arguments.of(new int[]{3, 2, 1}, new int[]{1, 2, 3}),
        Arguments.of(new int[]{6, 2, 2}, new int[]{2, 2, 6}),
        Arguments.of(new int[]{8, 1, 9}, new int[]{1, 8, 9}),
        Arguments.of(new int[]{21, 21, 3}, new int[]{3, 21, 21}),
        Arguments.of(new int[]{42, 1, 43}, new int[]{1, 42, 43}),
        Arguments.of(new int[]{42, 1, 43, 54}, new int[]{1, 42, 43, 54}),
        Arguments.of(new int[]{13, 14, 13, 14, 14, 13}, new int[]{13, 13, 13, 14, 14, 14}),
        Arguments.of(new int[]{31, 5, 765, 32, 9, 88, 32, 132, 5213, 2, 1}, new int[]{1, 2, 5, 9, 31, 32, 32, 88, 132, 765, 5213})
    );
  }

  @ParameterizedTest
  @MethodSource("data")
  void canSort(int[] unsorted, int[] sorted) {
    assertThat(MergeSort.run(unsorted)).containsExactly(sorted);
  }
}