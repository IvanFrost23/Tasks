import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n /= 3;
 
        System.out.println((n * 13 / 8)  + " " + (n / 2) + " " + (7 * n / 8)) ;
    }
}