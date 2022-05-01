import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ma = 0;
        int now = 0;
 
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x > 0) {
                now++;
            } else {
                ma = Math.max(ma, now);
                now = 0;
            }
        }
 
        System.out.println(Math.max(now, ma));
    }
}