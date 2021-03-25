 

public class Main {
    public static void main(String[] args) {
        GeneratePrime keyPair = new GeneratePrime();
        
        System.out.println(keyPair.getP() + " + " + keyPair.getQ() + " + " + keyPair.getN());
    }
}