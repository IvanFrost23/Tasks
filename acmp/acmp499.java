
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
        int k, w, a1, b1, a2, b2, a3, b3;
        k = scanner.nextInt();
        w = scanner.nextInt();
        a1 = scanner.nextInt();
        b1 = scanner.nextInt();
        a2 = scanner.nextInt();
        b2 = scanner.nextInt();
        a3 = scanner.nextInt();
        b3 = scanner.nextInt();
        if (b1 >= k && a1 <= w) {
            System.out.println("YES");
            return;
        }
        if (b2 >= k && a2 <= w) {
            System.out.println("YES");
            return;
        }
        if (b3 >= k && a3 <= w) {
            System.out.println("YES");
            return;
        }
        if (b1 + b2 >= k && a1 + a2 <= w) {
            System.out.println("YES");
            return;
        }
        if (b1 + b3 >= k && a1 + a3 <= w) {
            System.out.println("YES");
            return;
        }
        if (b2 + b3 >= k && a2 + a3 <= w) {
            System.out.println("YES");
            return;
        }
        if (b1 + b2 + b3 >= k && a1 + a2 + a3 <= w) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}