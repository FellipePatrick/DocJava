import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Function<Produto, Double> precoFinal =
                p -> p.preco * (1-p.desconto);
        UnaryOperator<Double> impostoMunicipal =
                v -> v >= 2500 ? v*1.085:v;
        UnaryOperator<Double> frete =
                p -> p >= 3000 ? p + 100:p+50;
        UnaryOperator<Double> arredondar =
                p -> Double.parseDouble(String.format("%.2f",p));
        Function<Double, String> formatar =
                p -> ("R$" + p).replace(".", ",");
        Produto pr = new Produto("Ipad", 3235.89, 0.13);
        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(pr);
        System.out.println("O preço final é " + preco);
    }
}
