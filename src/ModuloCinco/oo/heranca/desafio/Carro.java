package ModuloCinco.oo.heranca.desafio;

public class Carro {
    private int velocidade = 5;
    void acelerar(){
        velocidade += this.velocidade;
    }
    void frear(){
        if(velocidade  <= 0){
            System.out.println("Não tem como frear um carro desligado");
        }else{
            velocidade -= this.velocidade;
        }
    }
    int getVelocidade(){
        return this.velocidade;
    }
    void setVelocidade(int n){
        this.velocidade = n;
    }
    public String  toString(){
        return "A velocidade atual do carro é: " + this.velocidade + "km";
    }
}
