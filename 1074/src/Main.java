import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int line = sc.nextInt();
            list.add(line);
        }

        for (int i = 0; i < N; i++) {
            String l1, l2;
            if (list.get(i) == 0) {
                System.out.println("NULL");
                continue;
            }

            if (list.get(i) % 2 == 0) {
                l1 = "EVEN";
            }
            else {
                l1 = "ODD";
            }

            if(list.get(i) > 0) {
                l2 = "POSITIVE";
            }
            else {
                l2 = "NEGATIVE";
            }
            System.out.println(l1+" "+l2);
        }
    }
}