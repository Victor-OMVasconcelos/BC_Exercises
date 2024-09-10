import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double[] N = new double[100];
        N[0] = X;

        for (int i = 1; i < 100; i++) {
            N[i] = N[i-1] / 2;
        }

        for (int i = 0; i < 100; i++) {
            System.out.print("N["+i+"] = ");
            System.out.printf("%.4f\n",N[i]);
        }
    }
}