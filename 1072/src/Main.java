import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> out = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num >= 10 && num <= 20) {
                in.add(num);
            }
            else {
                out.add(num);
            }
        }

        System.out.println(in.size()+" in");
        System.out.println(out.size()+" out");


    }
}