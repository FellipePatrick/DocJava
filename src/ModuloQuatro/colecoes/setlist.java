package ModuloQuatro.colecoes;

import java.util.HashSet;
import java.util.Set;

public class setlist {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<>();
        lista.add("Fellipe");
        lista.add("Fellqipe");

        for (String candidato : lista) {
            System.out.println(candidato);
        }
    }
}
