package ModuloCinco.oo.polimorfismo;

public class Pessoa {
    private double peso;
    Pessoa(double peso){
        setPeso(peso);
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double x){
        if(x >= 0){
            this.peso +=  x;
        }
    }
    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }
}
