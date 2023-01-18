package ModuloDois.exercicios;

import java.util.Scanner;

public class segundo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um ano para verificarmos:");

        int ano = entrada.nextInt();

        if (ano % 4 == 0 || ano % 400 == 0) {
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("Não é");
        }

        entrada.close();
    }
}
