import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int [10];
        int input = 0;

        while (input < 10) {
            X[input] = sc.nextInt();
            input++;
        }

        for (int i = 0;i < 10;i++) {
            if (X[i] <= 0) {
                X[i] = 1;
            }
                System.out.println("X["+i+"] = "+X[i]);

        }


    }
}