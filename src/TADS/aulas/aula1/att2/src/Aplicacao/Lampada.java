package Aplicacao;

public class Lampada {
   private boolean ligada;
   private int potencia;

    public boolean isLigada() {
        return ligada;
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
       if(estaLigada()){
               System.out.println("A lampada ja esta ligada");
           }else{
               this.ligada = true;
               this.potencia = 10;
           }
       };

    public void desligar(){
       if(estaLigada()){
               this.ligada = false;
               this.potencia = 0;
           }else{
               System.out.println("A lampada já está desligada");
           }
       }
   boolean estaLigada(){
       if(this.ligada == true){
           return true;
       }
       return false;
   }
   public int verificarPotencia(){
       return this.potencia;
   }
   public void alterarPotencia(int novaPotencia){
       this.potencia = novaPotencia;
   }
}
