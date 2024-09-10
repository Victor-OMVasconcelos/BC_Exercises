import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[20];

        for (int i = 19; i >= 0; i--) {
            N[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("N["+i+"] = "+N[i]);
        }
    }
}