package ModuloQuatro.colecoes;

import java.util.HashSet;

public class Mapa {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Fellipe"));
        usuarios.add(new Usuario("Fernando"));
        usuarios.add(new Usuario("Josué"));

        boolean resultado = usuarios.contains(new Usuario("Fellipe"));
        System.out.println(resultado);
    }
}
