package controller;

public class VooMarcado extends Voo{
    private int numeroVagas, numeroCFumantes;
    public VooMarcado(int numero, int hora, Data data, int numeroVagas, int numeroCFumantes) {
        super(numero,hora, data, numeroVagas);
        this.numeroVagas = numeroVagas;
        this.numeroCFumantes = numeroCFumantes;
    }
    public void maxVagas(int x){
        numeroVagas = x;
    }
    public void cadeirasFumantes(int x){
        numeroCFumantes = x;
    }
    public String tipo(int nCadeira){
        if(nCadeira <= (numeroVagas-numeroCFumantes)){
            return "N";
        }else{
            if(nCadeira >= (numeroVagas-numeroCFumantes) && nCadeira <= numeroVagas){
                return "F";
            }else {
                return "ERRO";
            }
        }
    }
}
