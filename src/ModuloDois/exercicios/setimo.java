package ModuloDois.exercicios;

import java.util.Scanner;

public class setimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double n = 0;

        int cont = 0;

        double soma = 0;

        while (n >= 0) {

            cont++;

            System.out.println("Digite um numero:");

            n = entrada.nextDouble();

            if (n > 0) {
                soma = soma + n;
            }
        }

        System.out.println("A soma total é " + soma + " e você digitou " + cont + " vezes.");

        entrada.close();
    }
}
