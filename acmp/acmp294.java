import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k1, l1, m1;
        int k2, l2, m2;
        k1 = scanner.nextInt();
        l1 = scanner.nextInt();
        m1 = scanner.nextInt();
        k2 = scanner.nextInt();
        l2 = scanner.nextInt();
        m2 = scanner.nextInt();
 
        int ans = (k1 * l1 * m1) / 100 + (k2 * l2 * m2) / 100;
        k1 -= (k1 * l1) / 100;
        k2 -= (k2 * l2) / 100;
        int k = Math.min(k1, k2);
        ans += (k1 - k) * m1 + (k2 - k) * m2;
        System.out.println(ans);
    }
}