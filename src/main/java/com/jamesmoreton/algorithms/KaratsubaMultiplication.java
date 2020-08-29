package com.jamesmoreton.algorithms;

import java.math.BigInteger;

import static java.math.BigInteger.TEN;

/**
 * Input: two n-digit positive numbers x and y.
 *
 * <p>Output: the product x·y.</p>
 */
public class KaratsubaMultiplication {

  BigInteger run(BigInteger x, BigInteger y) {
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

    BigInteger ac = this.run(a, c);
    BigInteger bd = this.run(b, d);

    BigInteger p = a.add(b);
    BigInteger q = c.add(d);
    BigInteger pq = this.run(p, q);

    BigInteger adbc = pq.subtract(ac).subtract(bd);

    return (ac.multiply(TEN.pow(n))).add(adbc.multiply(TEN.pow(nOverTwo))).add(bd);
  }
}