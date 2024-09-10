import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[10];
        X[0] = sc.nextInt();
        System.out.println("N[0] = "+X[0]);

        for (int i = 1; i < 10; i++) {
            X[i] = X[i-1] * 2;
            System.out.println("N["+i+"] = "+X[i]);
        }
    }
}