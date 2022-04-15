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
 
        int sum1 = 0, sum2 = 0;
 
        for (int i = 0; i < 4; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
 
            sum1 += x;
            sum2 += y;
        }
 
        if (sum1 > sum2) {
            System.out.println(1);
        } else {
            if (sum1 == sum2) {
                System.out.println("DRAW");
            } else {
                System.out.println(2);
            }
        }
    }
}