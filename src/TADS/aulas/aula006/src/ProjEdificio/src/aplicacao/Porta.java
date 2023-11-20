package aplicacao;

public class Porta {
    private boolean aberta;
    private String cor;
    private float dimensaoX, dimensaoY, dimensaoZ;
    public Porta(boolean aberta, String cor, float dimensaoX, float dimensaoY, float dimensaoZ) {
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }
    public void abre(){
        if(!aberta){
            aberta = true;
        }
    }
    public void fecha(){
        if(aberta){
            aberta = false;
        }
    }
    public void pinta(String s){
        cor = s;
    }
    public boolean estaAberta(){
        return aberta;
    }
}
