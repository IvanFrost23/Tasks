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
        int n = scanner.nextInt();
        int ans1 = n / k;
        if (n % k != 0) {
            ans1++;
        }
        int ans2 = n % k;
        if (ans2 == 0) {
            ans2 = k;
        }
        System.out.print(ans1);
        System.out.print(" ");
        System.out.print(ans2);
    }
 
}