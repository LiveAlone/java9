module org.yqj.prime.faster {
    requires org.yqj.prime;
    provides org.yqj.prime.PrimeChecker with org.yqj.prime.faster.FasterPrimeChecker;
}