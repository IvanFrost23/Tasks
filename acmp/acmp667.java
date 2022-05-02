import java.util.*;

public class Main {
    static Map<Character, Character> a = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, k;
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();
        if (k == 1) {
            if (n != 0) {
                System.out.println(0);
            } else {
                System.out.println(m / k);
            }
            return;
        }
        if (k == 0) {
            System.out.println(0);
            return;
        }
        if (k == 2) {
            if (n != 0) {
                System.out.println(0);
            } else {
                System.out.println(m / k + m % k);
            }
            return;
        }
        int bus = n / (k - 2);
        if (n % (k - 2) != 0)
        {
            bus++;
        }
        if (bus * 2 > m)
        {
            System.out.println(0);
        } else {
            int buss = (n + m) / k;
            if ((n + m) % k != 0)
            {
                buss++;
            }
            System.out.println(buss);
        }

    }
}
