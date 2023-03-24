package ModuloCinco.oo.heranca.desafio;

public class Teste {
    public static void main(String[] args) {
        Carro carro = new Carro();

        Civic civic = new Civic();

        Ferrari ferrari = new Ferrari();

        ferrari.acelerar();
        civic.acelerar();
        ferrari.acelerar();

        ferrari.toString();
        civic.toString();
        carro.toString();
    }
}
