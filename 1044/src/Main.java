import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] list = line.split(" ");

        int A, B;

        A = Integer.parseInt(list[0]);
        B = Integer.parseInt(list[1]);

        if (A > B) {
            if (A % B == 0) {
                System.out.println("Sao Multiplos");
            }
            else {
                System.out.println("Nao sao Multiplos");
            }
        }
        else {
            if (B % A == 0) {
                System.out.println("Sao Multiplos");
            }
            else {
                System.out.println("Nao sao Multiplos");
            }
        }
    }
}