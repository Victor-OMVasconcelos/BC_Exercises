import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] list = line.split(" ");

        int A, B, C;

        A = Integer.parseInt(list[0]);
        B = Integer.parseInt(list[1]);
        C = Integer.parseInt(list[2]);

        int[] Array = {A,B,C};
        Arrays.sort(Array);

        int small,mid,big;

        small = Array[0];
        mid = Array[1];
        big = Array[2];

        System.out.println(small);
        System.out.println(mid);
        System.out.println(big);
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}