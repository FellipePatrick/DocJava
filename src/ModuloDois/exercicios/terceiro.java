package ModuloDois.exercicios;

import java.util.Scanner;

public class terceiro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");

        double n1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");

        double n2 = entrada.nextDouble();

        double media = (n1 + n2) / 2;

        if (media < 0 || media > 10) {
            System.out.println("Media invalida!");
        } else if (media >= 7) {
            System.out.println("O aluno está aprovado!");
        } else if (media >= 4 && media < 7) {
            System.out.println("O aluno está em recuperação.");
        } else {
            System.out.println("O aluno está reprovado!");
        }

        entrada.close();

    }
}
