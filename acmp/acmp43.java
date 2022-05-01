import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
 
        int now = 0;
        int ans = 0;
 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                now++;
            } else {
                ans = Math.max(ans, now);
                now = 0;
            }
        }
        System.out.println(Math.max(ans, now));
    }
}