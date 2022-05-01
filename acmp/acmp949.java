import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = n - 1; i >= 1; i--) {
            int ne = b - a;
            int tmp = a;
            a = ne;
            b = tmp;
        }
        System.out.println(a + " " + b);
    }
}