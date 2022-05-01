import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mas = new int[1000];
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            mas[x]++;
        }
        int ma = Integer.MIN_VALUE;
        int cnt = 0;
        int ans=-1;
        for (int i = 1; i <= 100; i++) {
            if (mas[i] > ma) {
                ma = mas[i];
                ans = i;
                cnt = 1;
            } else {
                if (mas[i] == ma) {
                    cnt++;
                }
            }
        }
        if (cnt == 1) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}