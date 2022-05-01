import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long a = scanner.nextLong();
        Long b = scanner.nextLong();
        Long ans = 0L;
 
        for (Long i = 1L; i <= 10000000; i++) {
            if (i * i == a * b) {
                ans = i;
                break;
            }
        }
 
        System.out.println(ans);
    }
}