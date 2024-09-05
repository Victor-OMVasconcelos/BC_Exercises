import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] list = line.split(" ");

        double X = Double.parseDouble(list[0]);
        double Y = Double.parseDouble(list[1]);

        if (X > 0 && Y > 0) {
            System.out.println("Q1");
        }
        else if (X > 0 && Y < 0) {
            System.out.println("Q4");
        }
        else if (X < 0 && Y > 0) {
            System.out.println("Q2");
        }
        else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        }
        else if (X == 0 && Y != 0) {
            System.out.println("Eixo Y");
        }
        else if (X != 0 && Y == 0) {
            System.out.println("Eixo X");
        }
        else {
            System.out.println("Origem");
        }

    }
}