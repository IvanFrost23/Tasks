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
 
        int n = scanner.nextInt();
 
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x <= 437) {
                System.out.print("Crash ");
                System.out.print(i + 1);
                java.lang.System.exit(0);
            }
        }
 
        System.out.print("No crash");
    }
}