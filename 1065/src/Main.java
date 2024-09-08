import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list =  new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int line = sc.nextInt();
            if (line % 2 == 0) {
                list.add(line);
            }
        }

        int result = list.size();
        System.out.println(result+" valores pares");

    }
}