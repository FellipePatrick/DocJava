package ModuloDois.exercicios;

import java.util.Scanner;

public class nono {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Digie um numero:");

            double n = entrada.nextDouble();

            if (n > numero) {
                numero = n;
            }
        }

        System.out.println("O maior numero digitado foi: " + numero);

        entrada.close();
    }
}
