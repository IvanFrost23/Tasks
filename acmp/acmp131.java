import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = -1;
        int ma = 0;
 
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (y == 1) {
                if (x > ma) {
                    ma = x;
                    ans = i + 1;
                }
            }
        }
        System.out.println(ans);
    }
}