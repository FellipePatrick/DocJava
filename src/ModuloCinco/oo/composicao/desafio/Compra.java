package ModuloCinco.oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<>();
    void adicionarItem(Produto p, int qtde){
        this.itens.add(new Item(p, qtde));
    }
    void adicionarItem(String nome, double preco, int qtde){
        Produto produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtde));
    }

    double getTotalPrecoItem(){
        double valor =  0;
        for(Item item: this.itens){
            valor += item.quantidade * item.produto.preco;
        }
        return  valor;
    }
}
