package ModuloQuatro.Desasfios;

import java.util.Scanner;

public class desafioarray {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero de notas que deseja informar:");

        int quantidade = entrada.nextInt();

        double[] listan = new double[quantidade];

        for (int i = 0; i < listan.length; i++) {
            int cont = i + 1;
            System.out.printf("Digite a nota %d: ", cont);
            listan[i] = entrada.nextInt();
        }

        double valor = 0;

        for (double lista : listan) {
            valor = valor + lista;
        }

        double media = valor / quantidade;

        System.out.printf("A media de notas informada é: %s", media);

        entrada.close();
    }
}
