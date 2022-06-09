import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int qZeroes = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            if (number.charAt(i) == '0') {
                qZeroes++;
            } else {
                break;
            }
        }

        System.out.print('1');
        for (int i = 0; i < qZeroes; i++) {
            System.out.print('0');
        }
    }
}
