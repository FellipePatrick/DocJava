package ModuloTres;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();

        p1.nome = "Notebook";
        p1.preco = 50;

        Produto p2 = new Produto();
        p2.nome = "Geladeira";
        p2.preco = 500;

        System.out.println(p1.calcula());

    }
}
