import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String[] list = line.split(" ");

        int A, B;

        A = Integer.parseInt(list[0]);
        B = Integer.parseInt(list[1]);

        if (A == B) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        if (A > B) {
            int result = (B + 12) - (A - 12);
            System.out.println("O JOGO DUROU "+result+" HORA(S)");
        }
        if (B > A) {
            int result = B - A;
            System.out.println("O JOGO DUROU "+result+" HORA(S)");
        }
    }
}