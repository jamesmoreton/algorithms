package com.jamesmoreton.algorithms;

import java.math.BigInteger;
import java.util.Arrays;

public class AlgorithmsMainline {

  // Karatsuba Multiplication
  private static final BigInteger X = new BigInteger("5678");
  private static final BigInteger Y = new BigInteger("1234");

  // Merge Sort
  private static final int[] UNSORTED = new int[]{5, 64, 14, 847, 23, 1};

  public static void main(String[] args) {
    BigInteger multiplied = new KaratsubaMultiplication().run(X, Y);
    System.out.printf("Karatsuba Multiplication:\n%s * %s = %s", X, Y, multiplied);

    int[] sorted = new MergeSort().run(UNSORTED);
    System.out.printf("\n\nMergeSort:\nUnsorted: %s\nSorted: %s", Arrays.toString(UNSORTED), Arrays.toString(sorted));
  }
}