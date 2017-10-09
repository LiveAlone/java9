module org.yqj.prime.generic {
    requires org.yqj.prime;
    provides org.yqj.prime.PrimeChecker with org.yqj.prime.generic.GenericPrimeChecker;
}