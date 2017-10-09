package com.jdojo.prime.probable;

import org.yqj.prime.PrimeChecker;

import java.math.BigInteger;

public class ProbablePrimeChecker {

    public static PrimeChecker provider() {
        final String PROVIDER_NAME = "yqj.probable.primechecker";
        return new PrimeChecker() {
            @Override
            public boolean isPrime(long n) {
                // Use 1000 for high certainty, which is an arbitrary big number I chose
                int certainty = 1000;
                return BigInteger.valueOf(n).isProbablePrime(certainty);
            }
            @Override
            public String getName() {
                return PROVIDER_NAME;
            }
        };
    }
}
