import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String[] list = line.split(" ");

        float nota1, nota2, nota3, nota4, media;

        nota1 = Float.parseFloat(list[0]) * 2;
        nota2 = Float.parseFloat(list[1]) * 3;
        nota3 = Float.parseFloat(list[2]) * 4;
        nota4 = Float.parseFloat(list[3]);

        media = (nota1 + nota2 + nota3 + nota4) / 10;

        if (media >= 7.0) {
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5.0) {
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno reprovado.");
        }
        else {
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno em exame.");
            float notaExam = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",notaExam);
            float notaFinal = (media + notaExam) / 2;
            if (notaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n",notaFinal);
            }
            else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n",notaFinal);
            }
        }
    }
}