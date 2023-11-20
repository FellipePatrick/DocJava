package aplicacao;

public class D extends A implements I1{
    private String nome;
    public D(String nome, String nome1) {
        super(nome);
        this.nome = nome1;
    }
    public void escreveAlgo(){};
    public String retornaBrasil(){return null;}
    public String getLetra(){return null;}
    public void setLetra(String letra){}

}
