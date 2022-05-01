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
 
        int L, W, H;
 
        L = scanner.nextInt();
        W = scanner.nextInt();
        H = scanner.nextInt();
 
        int ans = (2 * H * L + 2 * H * W) / 16;
 
        if ((2 * H * L + 2 * H * W) % 16 != 0) {
            ans++;
        }
 
        System.out.println(ans);
    }
}