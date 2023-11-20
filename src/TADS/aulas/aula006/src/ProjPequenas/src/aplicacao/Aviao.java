package aplicacao;

public class Aviao implements AlarmeIncendio{
    private float tamanho;
    private int qtdTurbinas;
    private boolean voar;
    public float getTamanho(){
        return this.tamanho;
    }
    public Aviao(float tamanho, int qtdTurbinas){
        this.tamanho = tamanho;
        this.qtdTurbinas = qtdTurbinas;
        voar = false;
    }
    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }
    public int getQtdTurbinas() {
        return qtdTurbinas;
    }
    public void setQtdTurbinas(int qtdTurbinas) {
        this.qtdTurbinas = qtdTurbinas;
    }
    public void ligarTurbina(){
        voar = true;
    }
    public void desligarTurbina(){
        voar = false;
    }
    @Override
    public String desocupar() {
        return "Todos devem sair com os paraquedas!";
    }
}
