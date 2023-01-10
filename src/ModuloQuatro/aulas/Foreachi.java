package ModuloQuatro.aulas;

public class Foreachi {
    public static void main(String[] args) {

        double[] notas = { 9.9, 8.7, 7.2, 9.4 };

        double valor = 0;

        for (double nota : notas) {
            valor = valor + nota;
            System.out.println(nota);
        }
        System.out.println(valor);

    }
}
