import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputList = input.split(" ");

        double quantity, price, total;

        int code = Integer.parseInt(inputList[0]);
        quantity = Double.parseDouble(inputList[1]);

        double[] items = {4.00, 4.50, 5.00, 2.00, 1.50};

        price = items[code-1];

        total = price * quantity;

        System.out.printf("Total: R$ %.2f\n",total);
    }
}