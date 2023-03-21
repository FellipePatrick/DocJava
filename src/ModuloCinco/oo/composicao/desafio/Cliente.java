package ModuloCinco.oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    final String nome;
    ArrayList<Compra> compras = new ArrayList<>();
    public Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }
    double getValorTotal(){
        double total = 0;
        for(Compra compra: this.compras){
            total += compra.getTotalPrecoItem();
        }
        return total;
    }
}
