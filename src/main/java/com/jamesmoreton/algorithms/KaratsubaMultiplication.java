package com.jamesmoreton.algorithms;

import java.math.BigInteger;

import static java.math.BigInteger.TEN;

class KaratsubaMultiplication {

  /**
   * Multiplies two integers.
   *
   * <p>Time complexity: O(n^(log2(3)))</p>
   *
   * @param x integer to multiply
   * @param y integer to multiply
   * @return the product x•y
   */
  static BigInteger run(BigInteger x, BigInteger y) {
    int n = Math.max(String.valueOf(x).length(), String.valueOf(y).length());

    if (n == 1) {
      // Base case
      return x.multiply(y);
    }

    if (n % 2 != 0) {
      n++;
    }

    int nOverTwo = n / 2;
    BigInteger b = x.mod(TEN.pow(nOverTwo));                  // Second half of x
    BigInteger a = (x.subtract(b)).divide(TEN.pow(nOverTwo)); // First half of x
    BigInteger d = y.mod(TEN.pow(nOverTwo));                  // Second half of y
    BigInteger c = (y.subtract(d)).divide(TEN.pow(nOverTwo)); // First half of y

    BigInteger ac = run(a, c);
    BigInteger bd = run(b, d);

    BigInteger p = a.add(b);
    BigInteger q = c.add(d);
    BigInteger pq = run(p, q);

    BigInteger adbc = pq.subtract(ac).subtract(bd);

    return (ac.multiply(TEN.pow(n))).add(adbc.multiply(TEN.pow(nOverTwo))).add(bd);
  }
}
