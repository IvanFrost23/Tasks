import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int c = scanner.nextInt();
 
        if ((n * m) % 2 == 0) {
            System.out.println("equal");
        } else {
            if (i % 2 == 0 && j % 2 == 0) {
                if (c == 0) {
                    System.out.println("black");
                } else {
                    System.out.println("white");
                }
            }
            if (i % 2 == 1 && j % 2 == 0) {
                if (c == 0) {
                    System.out.println("white");
                } else {
                    System.out.println("black");
                }
            }
            if (i % 2 == 0 && j % 2 == 1) {
                if (c == 0) {
                    System.out.println("white");
                } else {
                    System.out.println("black");
                }
            }
            if (i % 2 == 1 && j % 2 == 1) {
                if (c == 0) {
                    System.out.println("black");
                } else {
                    System.out.println("white");
                }
            }
        }
 
    }
}