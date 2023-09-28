import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class operadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media =
                (n1,n2) -> (n1+n2)/2;
        BiFunction<Double, Double, String> res =
                (n1,n2) -> ((n1+n2)/2) >= 7 ? "Ap":"Rp";
        System.out.println(res.apply(8.4,7.0));
    }
}
