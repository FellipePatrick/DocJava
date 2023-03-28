package ModuloCinco.oo.heranca.desafio;

public class Carro {
    private final int VelocidadeMaxima;
    private int velocidade;
    private int velocidadeAtual;

    public Carro(int velocidade, int vMaxima){
        this.velocidade = velocidade;
        this.VelocidadeMaxima = vMaxima;
    };
    public void acelerar(){
       if(velocidade + velocidadeAtual  > VelocidadeMaxima){
           velocidadeAtual = VelocidadeMaxima;
       }else {
           velocidadeAtual = velocidadeAtual + velocidade;
       }
    }
    public void frear(){
        if(velocidadeAtual  <= 0){
            System.out.println("Não tem como frear um carro desligado");
        }else{
            velocidadeAtual -= velocidade;
        }
    }
    public int getVelocidade(){
        return this.velocidadeAtual;
    }
    public void setVelocidade(int velocidade){
        this.velocidade =  velocidade;
    }
    public String  toString(){
        return "A velocidade atual do carro é: " + velocidadeAtual + "km/h";
    }
}
