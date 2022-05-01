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
         
        int n = scanner.nextInt();
         
        if (n < 0 || n > 12) {
            System.out.println("Error");
        } else {
            if (n == 12 || n == 1 || n == 2) {
                System.out.println("Winter");
            } else {
                if (n <= 5) {
                    System.out.println("Spring");
                } else {
                    if (n <= 8) {
                        System.out.println("Summer");
                    } else {
                        System.out.println("Autumn");
                    }
                }
            }
        }
         
    }
}