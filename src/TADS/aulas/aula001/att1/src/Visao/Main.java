package Visao;

import Aplicacao.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.setNome("Dog");
        System.out.println(c1.getNome());
    }
}