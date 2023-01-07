package ModuloDois;

import java.util.Scanner;

public class desafiowhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma nota");

        double total_notas = 0;

        int cont = 0;

        double nota = entrada.nextDouble();

        while (nota != -1) {

            if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida, por favor digite outra nota");

                System.out.println("Digite uma nota valida entre (1 e 10)");

                nota = entrada.nextDouble();
            } else {

                total_notas = nota + total_notas;

                cont = cont + 1;
            }

            System.out.println("Digite outra nota");

            nota = entrada.nextDouble();

        }

        System.out.printf("O programa foi finalizado, a soma total de notas foram: %s"
                + " E o tanto de notas digitadas foram de: %s", total_notas, cont);

        entrada.close();
    }
}
