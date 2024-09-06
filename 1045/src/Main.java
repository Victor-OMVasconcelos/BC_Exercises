import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] list = line.split(" ");

        double  largest, smallest, medium, smallExpo, bigExpo;

        float A = Float.parseFloat(list[0]);
        float B = Float.parseFloat(list[1]);
        float C = Float.parseFloat(list[2]);

         largest = Math.max(A,Math.max(B,C));
         smallest = Math.min(A,Math.min(B,C));
         medium = A + B + C - largest - smallest;
         smallExpo = Math.pow(smallest,2) + Math.pow(medium,2);
         bigExpo =  Math.pow(largest, 2);

        if ( largest >= smallest+medium) {
            System.out.println("NAO FORMA TRIANGULO");
            System.exit(0);
        }
        else {

            if (bigExpo == smallExpo) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (bigExpo > smallExpo) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }


            if (largest == medium && medium == smallest) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (largest == medium || medium == smallest || smallest == largest) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }









    }
}