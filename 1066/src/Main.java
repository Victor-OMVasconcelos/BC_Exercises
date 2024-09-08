import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();
        ArrayList<Integer> positivo = new ArrayList<>();
        ArrayList<Integer> negativo = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int line = sc.nextInt();
            if (line % 2 == 0) {
                par.add(line);
            }
            else {
                impar.add(line);
            }

            if (line > 0) {
                positivo.add(line);
            }
            if (line < 0){
                negativo.add(line);
            }

        }
        System.out.println(par.size()+" valor(es) par(es)");
        System.out.println(impar.size()+" valor(es) impar(es)");
        System.out.println(positivo.size()+" valor(es) positivo(s)");
        System.out.println(negativo.size()+" valor(es) negativo(s)");


    }
}