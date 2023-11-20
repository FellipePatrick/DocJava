package aplicacao;

public class Carro implements AlarmeIncendio {
    private float tamanho;
    private int qtdRodas;
    private boolean motor;
    public float getTamanho(){
        return this.tamanho;
    }
    public Carro(float tamanho, int qtdRodas){
        this.tamanho = tamanho;
        this.qtdRodas = qtdRodas;
        motor = false;
    }
    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }
    public int getqtdRodas() {
        return qtdRodas;
    }
    public void setqtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }
    public void ligarMotor(){
        motor = true;
    }
    public void desligarMotor(){
        motor = false;
    }
    @Override
    public String desocupar() {
        return "Todos devem abrir as portas e sair!";
    }
}