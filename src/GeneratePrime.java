import java.math.BigInteger;
import java.security.SecureRandom;

public class GeneratePrime {

    BigInteger p; 
    BigInteger q;
    BigInteger n; 
    BigInteger e;

    public GeneratePrime() {
        final SecureRandom random = new SecureRandom();
        
        do {
            p = BigInteger.probablePrime(1024, random);
            q = BigInteger.probablePrime(1024, random);
        } while (p.compareTo(q) == 0);
        
        n = p.multiply(q);
        e = new BigInteger("5");
    }

    public BigInteger getP() {
        return p;
    }

    public BigInteger getQ() {
        return q;
    }

    public BigInteger getN() {
        return n;
    }
}
