import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
 
        if (N * M < K) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}