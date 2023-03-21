package ModuloCinco.oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Item {
    int quantidade;
    Produto produto;

    Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

}
