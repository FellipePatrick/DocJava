package ModuloUm;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digie um numero: ");

        double num1 = entrada.nextDouble();

        System.out.println("Digie outro numero: ");

        double num2 = entrada.nextDouble();

        System.out.println("Escolha agora um operador logico entre ( * / + - ):");

        String operador = entrada.next();

        double resultadof = operador.equals("+") ? num1 + num2 : 0;

        resultadof = operador.equals("-") ? num1 - num2 : resultadof;

        resultadof = operador.equals("*") ? num1 * num2 : resultadof;

        resultadof = operador.equals("/") ? num1 / num2 : resultadof;

        System.out.printf("O resultado da %.1f %s %.1f = %.1f", num1, operador, num2, resultadof);

        entrada.close();

    }
}
