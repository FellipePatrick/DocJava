import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        Produto produto = new Produto("caneta", 32, 0.9);
        imprimir.accept(produto);
        List<Produto> produtos = Arrays.asList(produto);
    }
}
