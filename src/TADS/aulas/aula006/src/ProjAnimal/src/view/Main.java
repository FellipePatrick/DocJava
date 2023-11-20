package view;

import controller.Animal;
import controller.Cachorro;
import controller.Formiga;
import controller.Peixe;

public class Main {
    public static void main(String[] args) {
        Animal peixe = new Peixe(0);
        Cachorro cachorro = new Cachorro(4);
        Formiga formiga = new Formiga(8);
        peixe.come();
        cachorro.brinca();
        peixe.caminha();
        formiga.caminha();
        formiga.come();
    }
}