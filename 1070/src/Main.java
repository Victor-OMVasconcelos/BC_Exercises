import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = x + 11;

        while (x <= y) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
            x++;
        }

    }
}