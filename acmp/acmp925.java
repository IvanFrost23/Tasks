
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int max(int N, int M, int K) {
        if (N >= M && N >= K)
            return N;
        if (M >= N && M >= K)
            return M;
        return K;
    }

    static Long min(Long N, Long M, Long K) {
        if (N <= M && N <= K)
            return N;
        if (M <= N && M <= K)
            return M;
        return K;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, n, a, b, c;

        t = scanner.nextInt();
        n = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (t == 2) {
            System.out.println(Math.min(a, Math.min(b, c)));
        } else {
            System.out.println(Math.max(a + b + c - 2 * n, 0));
        }
    }
}