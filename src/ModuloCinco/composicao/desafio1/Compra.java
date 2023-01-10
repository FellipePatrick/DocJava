package ModuloCinco.composicao.desafio1;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int qtdade) {
        this.itens.add(new Item(p, qtdade));
    }

    void adicionarItem(String nome, double preco, int qtdade) {
        Produto produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtdade));
    }

    double obtervalorp() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;

    }

}
