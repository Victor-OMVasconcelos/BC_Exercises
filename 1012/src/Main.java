import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] list = line.split(" ");

        double A, B, C, triangle, circle, trapezium, square, rectangle;
        A = Double.parseDouble(list[0]);
        B = Double.parseDouble(list[1]);
        C = Double.parseDouble(list[2]);

        triangle = A*C/2;
        circle = 3.14159*(C*C);
        trapezium = ((A+B)*C)/2;
        square = B*B;
        rectangle = A*B;

        System.out.printf("TRIANGULO: %.3f\n",triangle);
        System.out.printf("CIRCULO: %.3f\n",circle);
        System.out.printf("TRAPEZIO: %.3f\n",trapezium);
        System.out.printf("QUADRADO: %.3f\n",square);
        System.out.printf("RETANGULO: %.3f\n",rectangle);



    }
}