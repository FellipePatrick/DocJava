package ModuloUm;

import javax.swing.JOptionPane;

public class conversao {
    public static void main(String[] args) {
        double a = 1;

        float b = (float) 1.12345; // explicita CAST

        Integer num1 = 10000;

        System.out.println(num1.toString());

        int num2 = 1200;

        System.out.println(Integer.toString(num2));

        // passando de string para int

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor");

        String valor2 = JOptionPane.showInputDialog("Digite o segndo valor");

        double n1 = Double.parseDouble(valor1);

        double n2 = Double.parseDouble(valor2);

        double soma = n1 + n2;

        double media = (n1 + n2) / 2;

        System.out.printf(
                "A soma é %s e a Media é %s", soma, media);
    }
}
