package ModuloDois;

import java.util.Scanner;

public class desafioif {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um dia da semana para converter para o dia  numerico (Segunda, Terça)");

        String dia = entrada.nextLine();

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.printf("O  dia %s refere-se ao numero 1", dia);
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.printf("O  dia %s refere-se ao numero 2", dia);
        } else if (dia.equalsIgnoreCase("terça")) {
            System.out.printf("O  dia %s refere-se ao numero 3", dia);
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.printf("O  dia %s refere-se ao numero 4", dia);
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.printf("O  dia %s refere-se ao numero 5", dia);
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.printf("O  dia %s refere-se ao numero 6", dia);
        } else if (dia.equalsIgnoreCase("sabado")) {
            System.out.printf("O  dia %s refere-se ao numero 7", dia);
        }

        entrada.close();

    }
}
