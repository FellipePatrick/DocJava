package Visao;

import Aplicacao.Lampada;

public class Main {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.ligar();
        l1.ligar();
        System.out.printf("A potencia é de: " + l1.verificarPotencia());

    }
}