package ModuloCinco.composicao.umparamuitos;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void adicionarItem(Item item) {
        this.itens.add(item);
        item.compra = this;
    }

    void adicionar(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    double valortotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.preco * item.quantidade;
        }
        return total;
    }
}
