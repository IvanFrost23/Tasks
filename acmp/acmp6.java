import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length() != 5) {
            System.out.println("ERROR");
            return;
        }
        if (str.charAt(0) >= 'A' && str.charAt(0) <= 'H' && str.charAt(3) >= 'A' && str.charAt(3) <= 'H') {
            if (str.charAt(1) >= '1' && str.charAt(1) <= '8' && str.charAt(4) >= '1' && str.charAt(4) <= '8') {
                if (str.charAt(2) == '-') {
                    int x1 = str.charAt(0) - 'A' + 1;
                    int y1 = str.charAt(1) - '0';
                    int x2 = str.charAt(3) - 'A' + 1;
                    int y2 = str.charAt(4) - '0';
                    int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
                    int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
                    for (int i = 0; i < 8; i++) {
                        int new_x = x1 + dx[i];
                        int new_y = y1 + dy[i];
                        if (new_x == x2 && new_y == y2) {
                            System.out.println("YES");
                            return;
                        }
                    }
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("ERROR");
    }
}