import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         double entry = sc.nextDouble();

         if (entry >=0 && entry <= 25) {
            System.out.println("Intervalo [0,25]");
        }
         else if (entry > 25 && entry <= 50) {
             System.out.println("Intervalo (25,50]");
         }
         else if (entry > 50 && entry <= 75) {
             System.out.println("Intervalo (50,75]");
         }
         else if (entry > 75 && entry <= 100) {
             System.out.println("Intervalo (75,100]");
         }
         else {
             System.out.println("Fora de intervalo");
         }
    }
}