package Aplicacao;

public class Lampada {
   private boolean ligada;
   private int potencia;

    public boolean isLigada() {
        return ligada;
    }

    public  Lampada(){}

    public Lampada(boolean ligada, int potencia){
        this.ligada = ligada;
        this.potencia = potencia;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void ligar(){
           this.ligada = true;
           this.potencia = 10;
       };

    public void desligar(){
           this.ligada = false;
           this.potencia = 0;
       }
   boolean estaLigada(){
       return this.ligada;
   }
   public int verificarPotencia(){
       return this.potencia;
   }
   public void alterarPotencia(int novaPotencia){
       this.potencia = novaPotencia;
   }
}
