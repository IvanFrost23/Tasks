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
 
        int ma = Integer.MIN_VALUE;
        int mi = Integer.MAX_VALUE;
 
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            ma = Math.max(ma, x);
            mi = Math.min(mi, x);
        }
 
        System.out.println(mi);
        System.out.println(" ");
        System.out.println(ma);
    }
}