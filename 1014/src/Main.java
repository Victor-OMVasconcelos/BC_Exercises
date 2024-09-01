import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dist = sc.nextInt();
        double litre = sc.nextDouble();

        double consumo = dist/litre;
        System.out.printf("%.3f km/l\n",consumo);

    }
}