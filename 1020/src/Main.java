import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        int ano = idade/365;
        int mes = (idade - (ano*365))/30;
        int dia = idade - (ano*365) -(mes*30);

        System.out.println(ano+" ano(s)");
        System.out.println(mes+" mes(es)");
        System.out.println(dia+" dia(s)");
    }
}