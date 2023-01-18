package ModuloDois.exercicios;

import java.util.Scanner;

public class primeiro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero para verificarmos se está entre 0 ou 10:");

        double n = entrada.nextDouble();

        if (n >= 0 && n <= 10) {
            if (n % 2 == 0) {
                System.out.println("O numero " + n + " é par");
            } else {
                System.out.println("O numero " + n + " é impar");
            }
        } else {
            System.out.println("O numero " + n + " não está no range >= 0 / <= 10");
        }

        entrada.close();
    }
}
