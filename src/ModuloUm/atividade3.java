package ModuloUm;

import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu primeiro salario: ");

        String s1 = entrada.nextLine().replace(',', '.');

        double n1 = Double.parseDouble(s1);

        System.out.print("Digite seu segundo salario: ");

        String s2 = entrada.nextLine().replace(',', '.');

        double n2 = Double.parseDouble(s2);

        System.out.print("Digite seu terceiro salario: ");

        String s3 = entrada.nextLine().replace(',', '.');
        ;

        double n3 = Double.parseDouble(s3);

        double media = (n1 + n2 + n3) / 3;

        System.out.printf("A media mensal do salario é de: %s R$", media);

        entrada.close();
    }

}
