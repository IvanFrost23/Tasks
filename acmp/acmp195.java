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
 
        System.out.println(2 * N * M * K);
    }
}