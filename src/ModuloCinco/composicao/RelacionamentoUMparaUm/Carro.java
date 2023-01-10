package ModuloCinco.composicao.RelacionamentoUMparaUm;

public class Carro {
    Motor motor = new Motor();

    boolean porta = true;

    void abrirp() {
        porta = true;
    }

    void fecharp() {
        porta = false;
    }

    void acelerar() {

        if (!porta && !motor.ligado) {
            motor.fatorInjecao += 0.4;
        } else if (!porta) {
            System.out.println("A porta está aberta, você não pode acelerar.");
        } else if (!motor.ligado) {
            System.out.println("O carro está desligado");
        } else {
            System.out.println("O motor está desligado e a porta está aberta");
        }
    }

    void frear() {
        motor.fatorInjecao -= 0.4;
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaligado() {
        return motor.ligado;
    }

    boolean estaaberta() {
        return porta;
    }
}