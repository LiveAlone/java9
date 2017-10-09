package org.yqj.prime;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public interface PrimeChecker {
    String getName();
    /**
     * Returns true if the specified number is a prime, false otherwise.
     *
     * @param n The number to be check for being prime
     * @return true if the specified number is a prime, false otherwise.
     */
    boolean isPrime(long n);
    /**
     * Returns the first PrimeChecker service provider found.
     *
     * @return The first PrimeChecker service provider found.
     * @throws RuntimeException When no PrimeChecker service provider is found.
     */
    static PrimeChecker newInstance() throws RuntimeException {
        return ServiceLoader.load(PrimeChecker.class)
                .findFirst()
                .orElseThrow(() -> new RuntimeException(
                        "No PrimeChecker service provider found."));
    }
    /**
     * Returns a PrimeChecker service provider instance by name.
     *
     * @param providerName The prime checker service provider name
     * @return A PrimeChecker
     */
    static PrimeChecker newInstance(String providerName) throws RuntimeException {
        ServiceLoader<PrimeChecker> loader = ServiceLoader.load(PrimeChecker.class);
        for (PrimeChecker checker : loader) {   // 注意 这里的所有关的 PrimeChecker 都被实例化了
            if (checker.getName().equals(providerName)) {
                return checker;
            }
        }
        throw new RuntimeException("A PrimeChecker service provider with the name '"
                + providerName + "' was not found.");
    }

    static List<PrimeChecker> startsWith(String prefix) {
        return ServiceLoader.load(PrimeChecker.class)
                .stream()
                .filter((ServiceLoader.Provider p) -> p.type().getName().startsWith(prefix))    // 现在过滤， 还没有被实例化 getType 获取的是Class, 不是 Bean getName
                .map(ServiceLoader.Provider::get)   // 这个时候才会被实例化
                .collect(Collectors.toList());
    }
}
