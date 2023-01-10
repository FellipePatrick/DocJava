package ModuloQuatro.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.offer("Bia");

        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.element()); // Lança uma exceção
    }
}
