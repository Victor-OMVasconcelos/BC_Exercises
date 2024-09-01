import java.util.Scanner;
public class Main {
    public static void main(String[]args){
       //1006
       Scanner sc = new Scanner(System.in);
       float A,B,C,D;
       A = sc.nextFloat();
       B =sc.nextFloat();
       C = sc.nextFloat();
       D = ((A*2)+(B*3)+(C*5))/10;
        System.out.printf("MEDIA = %.1f\n",D);

    }
}
