package aplicacao;

public class Predio implements AlarmeIncendio {
    private int qtdAndares;
    private boolean iluminacao;
    public Predio(int qtdAndares){
        this.qtdAndares = qtdAndares;
        iluminacao = false;
    }
    public int getQtdAndares() {
        return qtdAndares;
    }
    public void setQtdAndares(int qtdAndares) {
        this.qtdAndares = qtdAndares;
    }
    public void ligarIluminacao(){
        iluminacao = true;
    }
    public void desligarIluminacao(){
        iluminacao = false;
    }

    @Override
    public String desocupar() {
        return "Todos devem sair pela saida de emergencia do predio!";
    }
}
