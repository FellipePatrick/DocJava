package ModuloUm;

public class tiposSting {
    public static void main(String[] args) {
        // concatenar de forma facil
        String nome = "Fellipe";

        String sobrenome = "Patrick";

        System.out.printf("Nome: %s %s%n", nome, sobrenome);

        System.out.printf("Nome: %s%n", "João");

        System.out.printf("salario: %.1f%n", 123.6323);

        System.out.printf("Megasena: %d %d %d", 1, 2, 3);

        // Primitivos Vs Objetos

        String s = "Fellipe";

        s.toUpperCase();

        int a = 123;

        // não tem notação ponto com tipos primitivos

        // Wrappers são as versões objeto dos tipos primitivos

    }
}
