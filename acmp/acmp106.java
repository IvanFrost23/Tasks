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
 
        int n = scanner.nextInt();
        int front = 0, back = 0;
 
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
 
            if (x == 0) {
                front++;
            } else {
                back++;
            }
        }
 
        System.out.println(Math.min(front, back));
    }
}