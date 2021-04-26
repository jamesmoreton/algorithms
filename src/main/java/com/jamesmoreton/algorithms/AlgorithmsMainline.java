package com.jamesmoreton.algorithms;

import java.math.BigInteger;
import java.util.Arrays;

public class AlgorithmsMainline {

  private static final String DIVIDER = "------------------------";

  // Karatsuba Multiplication
  private static final BigInteger X = new BigInteger("5678");
  private static final BigInteger Y = new BigInteger("1234");

  // Merge Sort
  private static final int[] UNSORTED = new int[]{5, 64, 14, 847, 23, 1};

  public static void main(String[] args) {
    System.out.println("Algorithms");
    System.out.println(DIVIDER);

    System.out.printf("Karatsuba Multiplication:%n%s * %s = %s%n", X, Y, KaratsubaMultiplication.run(X, Y));
    System.out.println(DIVIDER);

    System.out.printf("MergeSort:%nUnsorted: %s%nSorted: %s%n", Arrays.toString(UNSORTED), Arrays.toString(MergeSort.run(UNSORTED)));
    System.out.println(DIVIDER);

    System.out.printf("Fibonacci, n = 10 (recursive): %s%n", Fibonacci.fib(10));
    System.out.printf("Fibonacci, n = 10 (iterative): %s%n", Fibonacci.fibIter(10));
    System.out.println(DIVIDER);
  }
}