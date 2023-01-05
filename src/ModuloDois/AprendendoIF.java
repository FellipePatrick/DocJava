package ModuloDois;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AprendendoIF {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o numero:");

        int numero = Integer.parseInt(valor);

        if (numero % 2 == 1) {
            System.out.println("Numero impar!");
        } else {
            System.out.println("Numero par");
        }

        Scanner entrada = new Scanner(System.in);

        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota invalida");
        } else if (nota > 8) {
            System.out.println("Aluno nota A");
        }

        entrada.close();
    }
}
