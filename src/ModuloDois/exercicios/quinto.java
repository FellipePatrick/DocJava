package ModuloDois.exercicios;

import java.util.Scanner;

public class quinto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro para descobrir se é primo ou não:");

        int n = entrada.nextInt();

        Double resto = (double) n % 2;

        switch (Double.toString(resto)) {
            case "0.0":
                System.out.println(n + " não é um numero primo");
                break;
            case "2":
                System.out.println(n + " é um numero primo");
                break;
            default:
                System.out.println(n + " é um numero primo");
                break;
        }

        entrada.close();
    }
}
