import java.math.BigInteger;
import java.util.stream.IntStream;

public class DuzeSilnie {

    static BigInteger silnia(int n) {
        return IntStream.rangeClosed(2, n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);

    }

    public static void main(String[] args) {
        for(int i=0; i <= 1000; i++) {
            System.out.printf("%4d → %s\n", i, silnia(i));
        }
    }

}
