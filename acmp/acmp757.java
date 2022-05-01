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
        Long C = scanner.nextLong();
        Long H = scanner.nextLong();
        Long O = scanner.nextLong();
        System.out.println(min(C / 2, H / 6, O));
    }
}