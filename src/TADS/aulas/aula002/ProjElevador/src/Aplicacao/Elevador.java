package Aplicacao;

public class Elevador {
    private int andarAtual;
    private int andaresTotal;
    private int capacidade;
    private int pessoas;
    public void inicializar(int capacidade, int andaresTotal){
        this.capacidade = capacidade;
        this.andaresTotal = andaresTotal;
    }
    public boolean entrar(){
        if(this.pessoas < this.capacidade){
            this.pessoas++;
            return true;
        }
        return false;
    }
    public boolean sai(){
        if(this.pessoas > 0){
            this.pessoas--;
            return true;
        }
        return false;
    }
    public boolean sobe(){
        if(this.andarAtual < this.andaresTotal){
            this.andarAtual++;
            return true;
        }
        return false;
    }
    public boolean desce(){
        if(this.andarAtual > 0){
            this.andarAtual--;
            return true;
        }
        return false;
    }
}
