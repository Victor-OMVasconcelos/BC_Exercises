import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        String[] list1 = line1.split(" ");
        String[] list2 = line2.split(" ");

        double numpeca1 = Double.parseDouble(list1[1]);
        double valorpeca1 = Double.parseDouble(list1[2]);

        double numpeca2 = Double.parseDouble(list2[1]);
        double valorpeca2 = Double.parseDouble(list2[2]);

        double pagar = (numpeca1*valorpeca1)+(numpeca2*valorpeca2);

        System.out.printf("VALOR A PAGAR: %.2f\n",pagar);

    }
}