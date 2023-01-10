package ModuloCinco.composicao.RelacionamentoUMparaUm;

public class TesteCar {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.abrirp();
        c1.ligar();
        c1.acelerar();
        c1.fecharp();
        c1.acelerar();
        int valor = c1.motor.giros();
        System.out.println(valor);

    }
}
