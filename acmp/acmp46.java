import java.util.*;
 
public class Main {
    static Map<Character, Character> a = new HashMap<>();
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a.put('0', '1');
        a.put('1', '2');
        a.put('2', '3');
        a.put('3', '4');
        a.put('4', '5');
        a.put('5', '6');
        a.put('6', '7');
        a.put('7', '8');
        a.put('8', '9');
        a.put('9', '0');
        String s = "2.7182818284590452353602875";
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println(3);
        } else {
            for (int i = 0; i < n + 1; i++)
            {
                System.out.print(s.charAt(i));
            }
            if (n < 25 && s.charAt(n + 2) >= '5') {
                System.out.println(a.get(s.charAt(n + 1)));
            } else {
                System.out.println(s.charAt(n + 1));
            }
        }
    }
}