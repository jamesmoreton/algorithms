package com.jamesmoreton.algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.math.BigInteger;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class KaratsubaMultiplicationTest {

  private static Stream<Arguments> data() {
    return Stream.of(
        Arguments.of(new BigInteger("4"), new BigInteger("6"), new BigInteger("24")),
        Arguments.of(new BigInteger("42"), new BigInteger("82"), new BigInteger("3444")),
        Arguments.of(new BigInteger("5678"), new BigInteger("1234"), new BigInteger("7006652")),
        Arguments.of(new BigInteger("12341214"), new BigInteger("96409523"), new BigInteger("1189810554980922")),
        Arguments.of(new BigInteger("8492846112947345"), new BigInteger("9184627492992444"), new BigInteger("78003627902730196203126654861180")),
        Arguments.of(new BigInteger("3141592653589793238462643383279502884197169399375105820974944592"), new BigInteger("2718281828459045235360287471352662497757247093699959574966967627"), new BigInteger("8539734222673567065463550869546574495034888535765114961879601127067743044893204848617875072216249073013374895871952806582723184"))
    );
  }

  @ParameterizedTest
  @MethodSource("data")
  void canMultiply(BigInteger x, BigInteger y, BigInteger expected) {
    assertThat(KaratsubaMultiplication.run(x, y)).isEqualTo(expected);
  }
}