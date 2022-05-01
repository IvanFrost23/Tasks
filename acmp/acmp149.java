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
        Stack <Integer> a = new Stack<>();
 
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            a.push(x);
        }
 
        while (!a.empty()) {
            System.out.print(a.pop());
            System.out.print(" ");
        }
    }
}