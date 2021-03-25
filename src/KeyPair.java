import java.math.BigInteger;
import java.security.SecureRandom;

public class KeyPair {
    static final SecureRandom random = new SecureRandom();

    static BigInteger p = BigInteger.probablePrime(4, random);
    static BigInteger q = BigInteger.probablePrime(4, random);
    static BigInteger n = p.multiply(q);

    public static BigInteger getPrime1() {
        return p;
    }

    public static BigInteger getQ() {
        return q;
    }

    public static BigInteger getN(){
        return n;
    }














}
