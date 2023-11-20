package controller;

public class Voo {
    private int hora;
    private int numero;
    private boolean[] cadeiras;
    private Data data;
    public Voo(int numero, int hora, Data data, int nM) {
        this.hora = hora;
        this.data = data;
        this.numero = numero;
        this.cadeiras = new boolean[nM];
        for(int i = 0; i < nM;i++){
            cadeiras[i] = true;
        }
    }
    public int proximoLivre() {
        if (cadeiras.length + 1 <= cadeiras.length) {
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
        for(int i = 0; i < cadeiras.length;i++){
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