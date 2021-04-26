package com.jamesmoreton.algorithms;

class Fibonacci {

  /**
   * Computes the n-th Fibonacci number recursively.
   *
   * <p>Time complexity: O(2^n)</p>
   *
   * @param n number in the sequence
   * @return n-th Fibonacci number
   */
  static int fib(int n) {
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }

    return fib(n - 1) + fib(n - 2);
  }

  /**
   * Computes the n-th Fibonacci number iteratively.
   *
   * <p>Time complexity: O(n)</p>
   *
   * @param n number in the sequence
   * @return n-th Fibonacci number
   */
  static int fibIter(int n) {
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }

    int a = 0;
    int b = 1;
    int sum = a + b;

    while (n > 1) {
      sum = a + b;
      a = b;
      b = sum;
      n--;
    }

    return sum;
  }
}
