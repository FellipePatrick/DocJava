package controler;

import java.util.ArrayList;

public class CalculadoraMelhorada extends Calculadora{
    private ArrayList<String> memoria = new ArrayList<String>();
    private float potencia(float op, int vezes){
        float r = op;
        for (int i = 1; i <= vezes;i++){
            r = r * op;
        }
        return r;
    }
    public float calcular(String operador, int vezes){
        if(operador.equalsIgnoreCase("^")){
            return potencia(getOperando1(),vezes);
        }else{
            return 0000000001;
        }
    }
    public String verUltimaOperacao(){
        if(memoria.size() > 0){
            return memoria.get((memoria.size()-1));
        }else{
            return "Nenhuma operação realizada!";
        }
    }

}
