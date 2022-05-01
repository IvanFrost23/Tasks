import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int h = scanner.nextInt(), m = scanner.nextInt();
        int hh = (s.charAt(0) - '0') * 10 + s.charAt(1) - '0';
        int mm = (s.charAt(3) - '0') * 10 + s.charAt(4) - '0';
        hh += h;
        mm += m;
        hh += mm / 60;
        mm = mm % 60;
        hh %= 24;
        String ans = "";
        if (hh < 10) {
            ans = "0" + Integer.toString(hh);
        } else {
            ans = Integer.toString(hh);
        }
        ans += ":";
        if (mm < 10) {
            ans += ("0" + Integer.toString(mm));
        } else {
            ans += Integer.toString(mm);
        }
        System.out.println(ans);
    }
}