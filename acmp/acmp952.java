import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
 
        if (n == 0 && m == 0) {
            System.out.println(0 + " " + 0);
        } else
        if (n == 0) {
            System.out.println("Impossible");
        } else {
            int ans = 0;
            if (n >= m) {
                ans = n;
            } else {
                ans = n + m - n;
            }
            int ans2 = n + Math.max(m - 1, 0);
            System.out.println(ans + " " + ans2);
        }
    }
}