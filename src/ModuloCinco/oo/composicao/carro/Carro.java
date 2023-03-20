package ModuloCinco.oo.composicao.carro;

public class Carro {
    boolean portas = true;
    Motor motor;
    Carro(){
        this.motor = new Motor(this);
    }
    void acelerar(){
        if(!motor.ligado){
            System.out.println("O carro está desligado, por favor ligue o carro!");
        }else{
                if(motor.fatorInjecao >= 3){
                    System.out.println("Você já atingiu o maximo do seu celta, não da mais guerreiro!");
                }else {
                    if(portas == true){
                        System.out.println("O carro está com as portas abertas");
                    }else{
                        motor.fatorInjecao += 0.4;
                    }
                 }
            }
        }
    void frear(){
        if(!motor.ligado){
            System.out.println("O carro está desligado, por favor ligue o carro!");
        }else{
            if(motor.fatorInjecao <= 0.5){
                System.out.println("Ops!!!! você freou tanto que o carro se desligou");
                motor.ligado = false;
            }else{
                motor.fatorInjecao -= 0.4;
            }
        }
    }

    void ligar(){
        if(motor.ligado == true){
            System.out.print("O carro ja está ligado!");
        }else{
            motor.ligado = true;
        }
    }

    void desligar(){
        if(motor.ligado == true){
            motor.ligado = false;
        }else{
            System.out.print("O carro ja está desligado!");
        }
    }

    void abrirPortas(){
        if(portas == true){
            System.out.print("As portas ja estao abertas!");
        }else {
            portas = true;
        }
    }

    void fecharPortas(){
        if(portas == false){
            System.out.print("As portas ja estao fechadas!");
        }else {
            portas = false;
        }
    }

    boolean estaLigado(){
        return motor.ligado;
    }
}
