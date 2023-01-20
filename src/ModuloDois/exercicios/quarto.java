package ModuloDois.exercicios;

import java.util.Scanner;

public class quarto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro para descobrir se é primo ou não:");

        int n = entrada.nextInt();

        if (n == 2) {
            System.out.println(n + " é primo");
        } else if (n % 2 != 0) {
            System.out.println(n + " é primo");
        } else if (n % 2 == 0) {
            System.out.println(n + " não é primo");
        }

        entrada.close();
    }
}
