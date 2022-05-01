import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
 
        String ans = "";
        int time = Integer.MAX_VALUE;
 
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            int sum = 0;
            for (int j = 0; j < m; j++) {
                int x = scanner.nextInt();
                sum += x;
            }
            if (sum < time) {
                time = sum;
                ans = s;
            }
        }
 
        System.out.println(ans);
 
    }
}