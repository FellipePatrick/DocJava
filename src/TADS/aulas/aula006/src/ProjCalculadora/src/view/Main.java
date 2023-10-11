package view;

import controler.Calculadora;
import controler.CalculadoraMelhorada;

public class Main {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        CalculadoraMelhorada c2 = new CalculadoraMelhorada();
        System.out.println(c1.calcular('+'));
        c2.setOperando1(4);
        c2.setOperando2(2);
        System.out.println(c2.calcular("^", 2));
    }
}