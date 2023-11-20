package aplicacao;

public abstract class Imovel {
    private String cor;
    public void pinta(String s){
        cor = s;
    }
    public Imovel(String cor){
        this.cor = cor;
    }
    public abstract int quantasPortasEstaoAbertas();
    public abstract int totalDePortas();
}
