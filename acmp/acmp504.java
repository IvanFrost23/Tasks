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
        int[] a = new int[3];
 
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
 
        int k = scanner.nextInt();
 
        for (int i = 0; i < k; i++) {
            int tmp = a[1];
            a[1] = a[2];
            a[2] = tmp;
             tmp = a[0];
            a[0] = a[1];
            a[1] = tmp;
 
        }
 
        for (int i = 0; i < 3; i++) {
            if (a[i] == 1) {
                System.out.print('G');
            }
            if (a[i] == 2) {
                System.out.print('C');
            }
            if (a[i] == 3) {
                System.out.print('V');
            }
        }
 
    }
 
    private static void swap(int i, int i1) {
        int tmp = i;
        i = i1;
        i1 = tmp;
    }
}