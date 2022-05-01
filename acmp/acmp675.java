import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
 
        n = scanner.nextInt();
        m = scanner.nextInt();
        String[] arr = new String[n];
 
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        int ans = Integer.MAX_VALUE;
 
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = m - 1; j >= 0; j--) {
                if (arr[i].charAt(j) == 'B') {
                    continue;
                }
                if (arr[i].charAt(j) == 'A') {
                    break;
                }
                cnt++;
            }
            ans = Math.min(ans, cnt);
        }
        System.out.println(ans);
    }
}