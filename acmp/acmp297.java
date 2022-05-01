import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0' || s.charAt(i) == '6' || s.charAt(i) == '9') {
                ans++;
            }
            if (s.charAt(i) == '8') {
                ans += 2;
            }
        }
        System.out.println(ans);
    }
}