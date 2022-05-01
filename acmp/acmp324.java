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
        int x4 = n % 10;
        n /= 10;
        int x3 = n % 10;
        n /= 10;
        int x2 = n % 10;
        n /= 10;
        int x1 = n;
 
        if (x1 == x4 && x2 == x3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}