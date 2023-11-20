package aplicacao;

public abstract class A {
    private String nome;
    public A(){};
    public A(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public abstract void escreveAlgo();
    public abstract String retornaBrasil();
}
