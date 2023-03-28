package ModuloCinco.oo.heranca.teste;

import ModuloCinco.oo.heranca.desafio.Civic;

public class Teste {
    public static void main(String[] args) {

        Civic civic = new Civic(10, 40);
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        System.out.println(civic.toString());

    }
}
