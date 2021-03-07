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
    int[] l = this.run(Arrays.copyOfRange(array, 0, nOverTwo));
    int[] r = this.run(Arrays.copyOfRange(array, nOverTwo, n));

    return merge(array, l, r, n);
  }

  private int[] merge(int[] array, int[] l, int[] r, int n) {
    int i = 0;
    int j = 0;

    for (int k = 0; k < n; k++) {
      if (i == l.length) {
        array[k] = r[j];
        j++;
        continue;
      }

      if (j == r.length) {
        array[k] = l[i];
        i++;
        continue;
      }

      if (l[i] < r[j]) {
        array[k] = l[i];
        i++;
      } else {
        array[k] = r[j];
        j++;
      }
    }

    return array;
  }
}