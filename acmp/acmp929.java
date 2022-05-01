import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        Long maxValue = 6 * n;
        Long minValue = n / 6 + (n % 6 == 0 ? 0 : 6 - n % 6 + 1);
        System.out.println(minValue + " " + maxValue);
    }
}