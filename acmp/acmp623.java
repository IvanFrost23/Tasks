import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println(1);
            return;
        }
        int x = 1;
        int y = 1;
        for (int i = 2; i <= n; i++) {
            int buf = y;
            y = (y + x) % 10;
            x = buf;
        }
        System.out.println(y);
    }
}
