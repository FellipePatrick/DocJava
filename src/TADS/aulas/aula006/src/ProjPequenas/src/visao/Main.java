package visao;

import aplicacao.AlarmeIncendio;
import aplicacao.Aviao;
import aplicacao.Carro;
import aplicacao.Predio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Predio p = new Predio(10);
        Carro c = new Carro(10,4);
        Aviao a = new Aviao(50,10);
        ArrayList<AlarmeIncendio> lista = new ArrayList<AlarmeIncendio>();
        lista.add(p);
        lista.add(c);
        lista.add(a);
        for(int i = 0; i < lista.size();i++){
            System.out.println(lista.get(i).desocupar());
        }
    }
}