package aplicacao;

public class Edificio extends Imovel{
    private int totalDePortas;
    private int totalDeAndares;
    private Porta[] portas;
    public Edificio(String cor, int totalDePortas, int totalDeAndares) {
        super(cor);
        this.totalDePortas = totalDePortas;
        this.totalDeAndares = totalDeAndares;
        this.portas = new Porta[totalDePortas];
    }
    public int quantasPortasEstaoAbertas(){
        int cont = 0;
        for(int i = 0; i < portas.length;i++){
            if(portas[i].estaAberta()){
                cont++;
            }
        }
        return cont;
    }
    public void adicionaPorta(Porta p){
        int cont = 0;
        while(portas[cont] != null){
            cont++;
        }
        if(cont < this.totalDePortas){
            portas[cont] = p;
        }
    }
    public int totalDePortas(){
        return portas.length;
    }
    public void adicionarAndar(){
        totalDeAndares++;
    }
    public int totalDeAndares(){
        return totalDeAndares;
    }
}
