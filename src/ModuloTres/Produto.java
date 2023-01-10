package ModuloTres;

public class Produto {

    String nome;
    double preco;
    static final double desconto = 0.25;

    double calcula() {
        return preco * (1 - desconto);
    }
}
