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
 
    static int min(int N, int M, int K) {
        if (N <= M && N <= K)
            return N;
        if (M <= N && M <= K)
            return M;
        return K;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
       Long a = scanner.nextLong();
       Long b = scanner.nextLong();
       Long c = scanner.nextLong();
 
       System.out.print(2 * a * b + 2 * a * c + 2 * b * c);
       System.out.print(" ");
       System.out.print(a * b * c);
    }
}