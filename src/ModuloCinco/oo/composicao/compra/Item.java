package ModuloCinco.oo.composicao.compra;

public class Item {

    Compra compra;
    String nome;
    int quantidade;
    double preco;
    Item( String nome, int quantidade, double preco){
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
    }


}
