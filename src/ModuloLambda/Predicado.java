import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro =
                prod -> (prod.preco * (1- prod.desconto)) >= 750;
        Produto p = new Produto("F", 10000, 0.13);
        System.out.println(isCaro.test(p));
    }
}
