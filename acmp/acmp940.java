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
        String s = scanner.next();
 
        for (int i = 0; i < s.length(); i++) {
            if (i == n - 1) {
                continue;
            }
            System.out.print(s.charAt(i));
        }
    }
 
}