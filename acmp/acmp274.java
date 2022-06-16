import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        for (int i = 0; i < K; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            Set <Integer> digits = new HashSet<>();
            Set <Integer> digits2 = new HashSet<>();

            while (A != 0) {
                digits.add(A % 10);
                A /= 10;
            }

            boolean f = true;

            while (B != 0) {
                digits2.add(B % 10);
                if (!digits.contains(B % 10)) {
                    f = false;
                }
                B /= 10;
            }
            if (f && digits.size() == digits2.size()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
