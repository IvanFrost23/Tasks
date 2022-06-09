import java.math.BigInteger;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger N = new BigInteger(scanner.next());
        BigInteger M = new BigInteger(scanner.next());
        if (M.equals(BigInteger.ZERO)) {
            System.out.println("NO");
        } else {
            N = N.add(BigInteger.ONE);
            System.out.println(N);
        }
    }
}