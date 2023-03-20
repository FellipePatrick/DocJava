package ModuloCinco.oo.composicao.carro;

public class testeCarro {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.ligar();
        carro.acelerar();
        carro.acelerar();
        carro.motor.giros();
    }
}
