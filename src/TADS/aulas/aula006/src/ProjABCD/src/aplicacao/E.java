package aplicacao;

import java.util.ArrayList;

public class E {
    private static ArrayList<A> lista = new ArrayList<A>();
    public static ArrayList<A> getLista() {
        return lista;
    }

    public static A adiciona(String obj) {
        int i;
        for(i = 0; i < lista.size(); i++){
            if(obj==lista.get(i).getNome()){
                return lista.get(i);
            }
        }
        return null;
    }
}