package org.yqj.prime.generic;

import org.yqj.prime.PrimeChecker;

public class GenericPrimeChecker implements PrimeChecker{

    private static final String PROVIDER_NAME = "yqj.generic.primechecker";

    @Override
    public boolean isPrime(long n) {
        if(n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if(n%2 == 0) {
            return false;
        }
        for(long i = 3; i < n; i += 2) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getName() {
        return PROVIDER_NAME;
    }
}
