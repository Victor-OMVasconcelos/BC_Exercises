import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] N = new int[1000];
        N[0] = 0;

        for (int i = 1; i < 1000; i++) {
            N[i] = N[i-1] + 1;
            if (N[i] == T) {
                N[i] = 0;
            }
        }

        for (int i = 0; i < 1000; i++) {
            System.out.println("N["+i+"] = "+N[i]);
        }
    }
}