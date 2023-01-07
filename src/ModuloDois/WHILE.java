package ModuloDois;

import java.util.Scanner;

public class WHILE {
    public static void main(String[] args) {

        int cont = 1;

        while (cont < 2) {
            System.out.printf("o valor de I é = %d%n", cont);
            cont++;
        }

        // for
        for (int i = 0; i < 2; i++) {
            System.out.println(i);
        }

        Scanner entrada = new Scanner(System.in);

        String pergunta = "sim";

        while (pergunta.equalsIgnoreCase("sim")) {

            System.out.println("Voce diz ... ");

            String resposta = entrada.nextLine();

            System.out.println("Voce quer continuar dizendo algo (Sim ou Não?");

            pergunta = entrada.nextLine();
        }

        System.out.println("O programa foi finalizado!");

        entrada.close();
    }
}
