
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (i <= x) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}