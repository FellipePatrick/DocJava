import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> apr = Arrays.asList("Ana", "Bia");

        System.out.println("Forma tradicional");
        for(String nome: apr){
            System.out.println(nome);
        }

        System.out.println("Lambda #01");
        apr.forEach(nome-> System.out.println(nome + "!!"));

        System.out.println("Referencia de Metodo #01");
        apr.forEach(System.out::println);

        System.out.println("Lambda #02");
        apr.forEach(nome-> meuImprimir(nome));

        System.out.println("Referencia de Metodo #02");
        apr.forEach(Foreach::meuImprimir);

    }

    static void meuImprimir(String nome){
        System.out.println("Oi! Meu nome é " + nome);
    }
}
