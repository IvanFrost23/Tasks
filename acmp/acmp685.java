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
 
    static int min(int N, int M, int K) {
        if (N <= M && N <= K)
            return N;
        if (M <= N && M <= K)
            return M;
        return K;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        ArrayList <Integer> arr1 = new ArrayList<>();
        ArrayList <Integer> arr2 = new ArrayList<>();
 
        for (int i = 0; i < 3; i++) {
            arr1.add(scanner.nextInt());
        }
 
        for (int i = 0; i < 3; i++) {
            arr2.add(scanner.nextInt());
        }
 
        Collections.sort(arr1);
        Collections.sort(arr2);
 
        int sum = 0;
 
        for (int i = 0; i < 3; i++) {
            sum += arr1.get(i) * arr2.get(i);
        }
 
        System.out.println(sum);
 
         
    }
}