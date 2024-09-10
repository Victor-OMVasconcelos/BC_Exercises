import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] X = new double[100];

        for (int i = 0; i < 100; i++) {
            X[i] = sc.nextDouble();

            if (X[i] <= 10) {
                System.out.println("A["+i+"] = "+X[i]);
            }
        }
    }
}