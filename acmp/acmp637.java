import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
            public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> lst = new ArrayList<>();
 
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            lst.add(x);
        }
        int k = scanner.nextInt();
        int ans = 0;
 
        for (int i = 0; i < n; i++) {
            ans += Math.min(k, lst.get(i));
        }
 
        System.out.println(ans);
    }
}