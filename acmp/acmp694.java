import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left = -Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            left = Math.max(left, x);
            right = Math.min(right, y);
        }
        if (left <= right) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}