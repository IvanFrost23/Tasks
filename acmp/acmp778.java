import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
 
        for (int i = 0; i < 31; i++) {
            int x = scanner.nextInt();
            ans += x;
        }
        System.out.println(ans / 27);
    }
}