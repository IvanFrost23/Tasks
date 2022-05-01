import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
 
        double ans = 0;
        int ind = 0;
 
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            double nal = ((double)x * (double)arr[i]) / (double)100;
            if (nal > ans) {
                ans = nal;
                ind = i;
            }
        }
        System.out.println(ind + 1);
    }
}