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
 
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
 
        System.out.print(max(N, M, K) - min(N, M, K));
    }
}