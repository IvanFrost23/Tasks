import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] a = new char[3][3];
 
        for (int i = 0; i < 3; i++) {
            String s = scanner.next();
            a[i][0] = s.charAt(0);
            a[i][1] = s.charAt(1);
            a[i][2] = s.charAt(2);
        }
 
        for (int i = 0; i < 3; i++) {
            if (a[i][0] == 'X' && a[i][1] == 'X' && a[i][2] == 'X') {
                System.out.println("Win");
                return;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (a[0][i] == 'X' && a[1][i] == 'X' && a[2][i] == 'X') {
                System.out.println("Win");
                return;
            }
        }
 
        if (a[0][0] == 'X' && a[1][1] == 'X' && a[2][2] == 'X') {
            System.out.println("Win");
            return;
        }
 
        if (a[0][2] == 'X' && a[1][1] == 'X' && a[2][0] == 'X') {
            System.out.println("Win");
            return;
        }
 
        for (int i = 0; i < 3; i++) {
            if (a[i][0] == 'O' && a[i][1] == 'O' && a[i][2] == 'O') {
                System.out.println("Lose");
                return;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (a[0][i] == 'O' && a[1][i] == 'O' && a[2][i] == 'O') {
                System.out.println("Lose");
                return;
            }
        }
 
        if (a[0][0] == 'O' && a[1][1] == 'O' && a[2][2] == 'O') {
            System.out.println("Lose");
            return;
        }
 
        if (a[0][2] == 'O' && a[1][1] == 'O' && a[2][0] == 'O') {
            System.out.println("Lose");
            return;
        }
        System.out.println("Draw");
    }
}