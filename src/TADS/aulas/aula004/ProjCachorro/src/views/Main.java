package views;

import controller.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.setNome("Bob");
        c1.setRaca("Comum");
        c1.setIdade(1);
        Cachorro c2;
        c2 = c1.clonarCachorro();
        System.out.println(c2.getNome());
        System.out.println(c2.informarEstado().getNome());
        System.out.println(c1.equals(c2));
    }
}