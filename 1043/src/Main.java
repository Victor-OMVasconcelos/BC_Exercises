import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String[] list = line.split(" ");

        double A, B, C;

        A = Double.parseDouble(list[0]);
        B = Double.parseDouble(list[1]);
        C = Double.parseDouble(list[2]);

        if (A + B > C && A + C > B && C + B > A) {
            double perim = A + B + C;
            System.out.printf("Perimetro = %.1f\n",perim);
        }
        else {
            double area = (A + B) * C / 2;
            System.out.printf("Area = %.1f\n",area);
        }
    }
}