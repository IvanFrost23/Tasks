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
        String s = "qwertyuiopasdfghjklzxcvbnm";
        char x;
 
        Scanner scanner = new Scanner(System.in);
 
        x = scanner.next().charAt(0);
 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                System.out.println(s.charAt((i + 1) % 26));
            }
        }
    }
}