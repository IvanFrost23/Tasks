import java.util.Scanner;
import java.util.Set;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int ans = 0;
        for (int i = 1; i <= K; i++) {
            if (i + reverse(i) == K) {
                ans++;
            }
        }
        System.out.println(ans);
    }
 
    private static int reverse(int x) {
        int num = 0;
        while (x != 0) {
            num = num * 10 + x % 10;
            x /= 10;
        }
        return num;
    }
}