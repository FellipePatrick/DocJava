package controler;

import java.util.ArrayList;

public class Voo {
    private int hora;
    // private int numero; A FAZER
    private boolean[] cadeiras = new boolean[100];
    private Data data;
    public Voo(int hora, Data data) {
        for(int i = 0; i < 100;i++){
            cadeiras[i] = true;
        }
        this.hora = hora;
        this.data = data;
    }
    public int proximoLivre() {
        if (cadeiras.length + 1 <= 100) {
            return cadeiras.length + 1;
        }else {
            return 0;
        }
    }
    public boolean verifica(int cadeira){
        return cadeiras[cadeira-1];
    }
    public boolean ocupa(int cadeira){
        if(verifica(cadeira)){
            this.cadeiras[cadeira-1] = false;
            return true;
        }
        return false;
    }
    public int vagas(){
        int cont = 0;
        for(int i = 0; i < 100;i++){
            if(cadeiras[i]){
               cont++;
            }
        }
        return cont;
    }
    public Data getData(){
        return this.data;
    }
    public Voo clone(){
        return this;
    }

}