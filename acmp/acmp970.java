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
 
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int r = scanner.nextInt();
 
       if (w + h == r || w + r == h || h + r == w) {
           System.out.println("YES");
       } else {
           System.out.println("NO");
       }
    }
}