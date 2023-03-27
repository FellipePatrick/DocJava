package ModuloCinco.oo.heranca.desafio;

public class Carro {
    final int VelocidadeMaxima;
    private int velocidade;
    private int velocidadeAtual;

    Carro(int velocidade, int vMaxima){
        this.velocidade = velocidade;
        this.VelocidadeMaxima = vMaxima;
    };
    void acelerar(){
       if(velocidade + velocidadeAtual  > VelocidadeMaxima){
           velocidadeAtual = VelocidadeMaxima;
       }else {
           velocidadeAtual = velocidadeAtual + velocidade;
       }
    }
    void frear(){
        if(velocidadeAtual  <= 0){
            System.out.println("Não tem como frear um carro desligado");
        }else{
            velocidadeAtual -= velocidade;
        }
    }
    int getVelocidade(){
        return this.velocidadeAtual;
    }
    void setVelocidade(int velocidade){
        this.velocidade =  velocidade;
    }
    public String  toString(){
        return "A velocidade atual do carro é: " + velocidadeAtual + "km/h";
    }
}
