package ModuloQuatro.colecoes;

import java.util.ArrayList;

public class listt {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Fellipe"));
        lista.add(new Usuario("Marcos"));
        lista.add(new Usuario("Fernando"));

        System.out.println(lista.get(1));

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }
    }
}
