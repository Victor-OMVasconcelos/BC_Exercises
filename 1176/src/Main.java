import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] fibo = new long[61];
        int[] input = new int[N];
        fibo[0] = 0;
        fibo[1] = 1;


        for (int i = 2; i < 61; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            System.out.println("Fib("+input[i]+") = "+fibo[input[i]]);
        }



    }
}