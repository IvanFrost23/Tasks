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
 
        int k = scanner.nextInt();
 
        for (int i = 0; i < k; i++) {
            int n, m;
 
            n = scanner.nextInt();
            m = scanner.nextInt();
 
            System.out.println(19 * m + (n + 239) * (n + 366) / 2);
        }
    }
}