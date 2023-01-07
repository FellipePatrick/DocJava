package ModuloTres;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();

        p1.nome = "Notebook";
        p1.preco = 50;
        p1.desconto = 0.25;

        Produto p2 = new Produto();
        p2.nome = "Geladeira";
        p2.preco = 500;
        p2.desconto = 0.50;

        System.out.println(p2.nome);

    }
}
