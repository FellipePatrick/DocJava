package ModuloCinco.oo.polimorfismo;

public class Comida {
    private double peso;
    Comida(double peso){
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
}
