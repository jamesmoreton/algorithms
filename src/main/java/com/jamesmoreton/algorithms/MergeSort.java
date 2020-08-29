package com.jamesmoreton.algorithms;

import java.util.Arrays;

/**
 * Input: array of n distinct integers.
 *
 * <p>Output: array with the same integers, sorted from smallest to largest.</p>
 */
public class MergeSort {

  int[] run(int[] array) {
    int n = array.length;

    if (n <= 1) {
      // Base case
      return array;
    }

    int nOverTwo = n / 2;
    int[] a = this.run(Arrays.copyOfRange(array, 0, nOverTwo));
    int[] b = this.run(Arrays.copyOfRange(array, nOverTwo, n));

    return merge(a, b);
  }

  private int[] merge(int[] a, int[] b) {
    int n = a.length + b.length;
    int[] c = new int[n];
    int i = 0;
    int j = 0;

    for (int k = 0; k < n; k++) {
      if (i == a.length) {
        c[k] = b[j];
        j++;
        continue;
      }

      if (j == b.length) {
        c[k] = a[i];
        i++;
        continue;
      }

      if (a[i] < b[j]) {
        c[k] = a[i];
        i++;
      } else {
        c[k] = b[j];
        j++;
      }
    }

    return c;
  }
}