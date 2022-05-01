import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String p1  = scanner.nextLine();
        String p2 = scanner.nextLine();
        String p3 = scanner.nextLine();
 
        ArrayList<String> arr = new ArrayList<>();
 
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
 
        Collections.sort(arr);
 
        System.out.println(name + ": " + arr.get(0) + ", " + arr.get(1) + ", " + arr.get(2));
    }
}