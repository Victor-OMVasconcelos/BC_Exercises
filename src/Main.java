import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
public class Main {
    public static void main(String[] args) {
        /*Scanner reader = new Scanner(System.in);
        double A, N, X;

        //System.out.println("Type A: ");
        A = reader.nextDouble();
        N = 3.14159;
        X = A*A*N;
        System.out.printf("A=%.4f\n", X);
        */
        /*Scanner reader = new Scanner(System.in);
        int A, B, C, D, E;

        //System.out.println("Type A: ");
        A = reader.nextInt();
        B = reader.nextInt();
        C = reader.nextInt();
        D = reader.nextInt();
        E = (A * B - C * D);
        System.out.println("DIFERENCA = "+E);
        */

       /* Scanner reader = new Scanner(System.in);
        String name;
        double salary, sale, percent, total;


        //System.out.println("Type A: ");
        name = reader.nextLine();
        salary = reader.nextDouble();
        sale = reader.nextDouble();
        percent = sale * 0.15;
        total = salary + percent;
        System.out.printf("TOTAL = %.2f\n", total);*/
        //Scanner reader = new Scanner(System.in);
        /*int radius = reader.nextInt();
        double volume = 4*3.14159*radius*radius*radius/3;
        System.out.printf("VOLUME = %.3f\n", volume);/*

         */
        /*int A = reader.nextInt();
        int B = reader.nextInt();
        int C = reader.nextInt();

        int D = (A + B + abs(A-B))/2;
        int E = (D + C + abs(D - C))/2;
        System.out.println(E+" eh o maior");
        */


       /*1013
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String[] number1 = line1.split(" ");
        String[] number2 = line2.split(" ");



       double X1 = Double.parseDouble(number1[0]);
       double Y1 = Double.parseDouble(number1[1]);
       double X2 = Double.parseDouble(number2[0]);
       double Y2 = Double.parseDouble(number2[1]);

        double R = sqrt(((X2 - X1)* (X2 - X1))+ ((Y2 - Y1)*(Y2 - Y1)));
        System.out.printf("%.4f\n",R);*/

        //1017
        /*Scanner sc = new Scanner(System.in);
        double A = sc.nextInt();
        double B = sc.nextInt();
        double C = A*B/12;
        System.out.printf("%.3f\n", C);
         */
       /* 1019
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int hora, minuto, segundo;


        if (numero >= 3600) {
            hora = numero/3600;
            minuto = (numero%3600)/60;
            segundo = (numero%3600)%60;
        } else if (numero > 60 ) {
            hora = 0;
            minuto = numero/60;
            segundo = numero%60;
        } else {
            hora = 0;
            minuto = 0;
            segundo = numero;
        }
        System.out.println(hora+":"+minuto+":"+segundo);
        */
        /* 1019 ALTERNATIVA
       Scanner sc = new Scanner(System.in);
       int numero, hora, minuto, segundo;
       numero = sc.nextInt();
       hora = numero/3600;
       minuto = numero%3600/60;
       segundo = numero%60;
        System.out.println(hora+":"+minuto+":"+segundo);

         */
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] number = num.split("\\.");
        int real = Integer.parseInt(number[0]);
        int cent = Integer.parseInt(number[1]);
        int n100, n50, n20, n10, n5, n2, n1, n050, n025, n010, n005, n001;

        n100 = real/100;
        n50 = (real-(n100*100))/50;
        n20 = (real-(n100*100) - (n50*50))/20;
        n10 = (real-(n100*100) - (n50*50) - (n20*20))/10;
        n5 = (real-(n100*100) - (n50*50) - (n20*20) - (n10*10))/5;
        n2 = (real-(n100*100) - (n50*50) - (n20*20) - (n10*10) - (n5*5))/2;
        n1 = (real-(n100*100) - (n50*50) - (n20*20) - (n10*10) - (n5*5) - (n2*2));

        n050 = cent/50;
        n025 = (cent - (n050*50))/25;
        n010 = (cent - (n050*50) - (n025*25))/10;
        n005 = (cent - (n050*50) - (n025*25) - (n010*10))/5;
        n001 = (cent - (n050*50) - (n025*25) - (n010*10) - (n005*5));

        System.out.println("NOTAS:");
        System.out.println(n100+" nota(s) de R$ 100.00");
        System.out.println(n50+ " nota(s) de R$ 50.00");
        System.out.println(n20+ " nota(s) de R$ 20.00");
        System.out.println(n10+" nota(s) de R$ 10.00");
        System.out.println(n5+ " nota(s) de R$ 5.00");
        System.out.println(n2+ " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(n1+" moeda(s) de R$ 1.00");
        System.out.println(n050+" moeda(s) de R$ 0.50");
        System.out.println(n025+" moeda(s) de R$ 0.25");
        System.out.println(n010+" moeda(s) de R$ 0.10");
        System.out.println(n005+" moeda(s) de R$ 0.05");
        System.out.println(n001+" moeda(s) de R$ 0.01");



    }
}
