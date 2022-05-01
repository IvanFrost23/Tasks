import java.util.ArrayList;
import java.util.Collections;
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
 
        int X = scanner.nextInt();
 
        StringBuilder YY = new StringBuilder();
 
        YY.append(Integer.toString(X));
        int len = YY.length();
        StringBuilder Y = new StringBuilder();
        for (int i= 0; i < 4 - len; i++) {
            Y.append('0');
        }
            Y.append(Integer.toString(X));
 
            if (X % 400 == 0) {
                System.out.print("12/09/");
                System.out.print(Y);
            } else {
                if (X % 100 == 0) {
                    System.out.print("13/09/");
                    System.out.print(Y);
                } else {
                    if (X % 4 == 0) {
                        System.out.print("12/09/");
                        System.out.print(Y);
                    } else {
                        System.out.print("13/09/");
                        System.out.print(Y);
                    }
                }
            }
    }
 
}