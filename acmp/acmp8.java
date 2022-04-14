import java.util.Scanner;
 
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
 
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
 
        if (A * B == C) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}