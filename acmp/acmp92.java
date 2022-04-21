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
 
        String ans = String.valueOf(n / 6) + ' ' + String.valueOf(n - n/ 3) + ' ' + String.valueOf(n / 6);
 
        System.out.println(ans);
    }
}