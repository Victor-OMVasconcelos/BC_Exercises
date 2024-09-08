import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        double soma = 0;

        for (int i=0;i<6;i++) {
            double num = sc.nextDouble();
            if (num > 0) {
                list.add(num);
                soma += num;
            }
        }
        int len = list.size();
        double media = soma / len;

        System.out.println(len+" valores positivos");
        System.out.println(media);







    }
}