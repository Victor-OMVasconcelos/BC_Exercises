import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] list = line.split(" ");

        int A, B, C, D;

        A = Integer.parseInt(list[0]);
        B = Integer.parseInt(list[1]);
        C = Integer.parseInt(list[2]);
        D = Integer.parseInt(list[3]);

        if (!(B > C)) {
            System.out.println("Valores nao aceitos");
        }
        else if (!(D > A)) {
            System.out.println("Valores nao aceitos");
        }
        else if (!(C+D > A+B)) {
            System.out.println("Valores nao aceitos");
        }
        else if (!(C > 0 && D > 0)) {
            System.out.println("Valores nao aceitos");
        }
        else if (!(A % 2 == 0)) {
            System.out.println("Valores nao aceitos");
        }
        else {
            System.out.println("Valores aceitos");
        }
    }
}