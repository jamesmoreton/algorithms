# Algorithms

Java implementations of selected algorithms for solving classic computational problems with improved running time.

## [Karatsuba Multiplication](https://en.wikipedia.org/wiki/Karatsuba_algorithm)

A "divide-and-conquer" algorithm for integer multiplication discovered in 1960 by Anatoly Karatsuba.

This algorithm regards the first and second half of the given numbers in their own right and makes only three recursive calls.

E.g. Given two _n_-digit positive integers _x_ and _y_:

> _x_ = 1234, _y_ = 6789

_a_ = 12; _b_ = 34; _c_ = 67; _d_ = 89

With a time complexity of O(n^(log2(3))) this method is a significant improvement on long multiplication for large values of _n_.

## [Merge Sort](https://en.wikipedia.org/wiki/Merge_sort)

A "divide-and-conquer" sorting algorithm known to John Von Neumann as early as 1945.

This algorithm splits the input array into two halves, solves each recursively and combines the result in a merge subroutine.

With a time complexity of O(nlog2(n)), merge sort provides dramatic improvements in running time over traditional sorting algorithms for large values of _n_ (e.g. selection sort, insertion sort etc.).