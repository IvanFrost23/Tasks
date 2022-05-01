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
 
        lst.add(lst.get(0));
        lst.add(lst.get(1));
 
        int ans = Integer.MIN_VALUE;
 
        for (int i = 2; i < lst.size(); i++) {
            ans = Math.max(ans, lst.get(i - 2) + lst.get(i - 1) + lst.get(i));
        }
        System.out.println(ans);
    }
}