package controller;

public class Robo {
    private int linha = 0;
    private int coluna = 0;
    private int passo;

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getPasso() {
        return passo;
    }

    public void setPasso(int passo) {
        this.passo = passo;
    }
    public Robo(int passo){
        this.passo = passo;
    }
    public String mostrarPosicaoAtual(){
        return this.linha+","+this.coluna;
    }
    public int andarFrente(){
        return this.linha = this.linha + this.passo;
    }
    public int andarTras(){
        return this.linha = this.linha - this.passo;
    }
    public int andarDireita(){
        return this.coluna += this.passo;

    }
    public int andarEsquerda(){
        return this.coluna -= this.passo;
    }

}
