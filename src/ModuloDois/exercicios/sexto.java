package ModuloDois.exercicios;

import java.util.Scanner;

public class sexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 5;

        int falta = 10;

        boolean valor = false;

        System.out.println("tente adivinhar o numero, digite um:");

        int np = scanner.nextInt();

        if (np == numero) {
            System.out.println("Parabens você acertou de primeira! O resulto é " + numero + ".");
        } else {

            int cont = 1;

            while (10 >= cont) {
                System.out.println("tente adivinhar o numero, digite um:");

                np = scanner.nextInt();

                falta = falta - cont;

                cont++;

                if (np >= 0 && 100 <= np) {
                    if (np > numero) {
                        System.out
                                .println(np + " é maior que o numero, seu numero de tentativas restantes é " + falta
                                        + ".");
                        falta = 10;
                    } else if (np < numero) {
                        System.out
                                .println(np + " é menor que o numero, seu numero de tentativas restantes é " + falta
                                        + ".");
                        falta = 10;
                    } else if (np == numero) {
                        valor = true;
                        cont = 10;
                    } else {
                        System.out.println("O que você digitou não é valido para essa tarefa!");
                    }
                }
            }

            if (valor == true) {
                System.out.println("Você acertou, parabens! em " + falta + " tentativas.");
            } else {
                System.out.println("Você não conseguiu, que pena.");
            }
        }

        scanner.close();
    }
}
