import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n - 8 >= 1) {
            System.out.print(n - 8 + " ");
        }
 
        if (n % 8 != 1) {
            System.out.print(n - 1 + " ");
        }
 
        if (n % 8 != 0) {
            System.out.print(n + 1 + " ");
        }
 
        if (n + 8 <= 64) {
            System.out.print(n + 8 + " ");
        }
    }
}