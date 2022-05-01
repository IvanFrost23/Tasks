import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a, b;
 
        n = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
 
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
 
        System.out.println(Math.min(Math.abs(b - a) - 1, n - b + a - 1));
    }
}