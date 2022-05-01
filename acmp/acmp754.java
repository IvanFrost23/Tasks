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
 
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
 
        if (min(a, b, c) < 94 || max(a, b, c) > 727) {
            System.out.println("Error");
        } else {
            System.out.println(max(a, b, c));
        }
    }
}