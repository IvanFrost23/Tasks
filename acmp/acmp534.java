import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cnt = new int[200000];
        List<Integer> arr = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            cnt[i] = x;
        }
        int m = scanner.nextInt();
 
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            cnt[x - 1]--;
        }
 
        for (int i = 0; i < n; i++) {
            System.out.println(cnt[i] >= 0 ? "no" : "yes");
        }
    }
}