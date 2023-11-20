package controller;

public class Cachorro extends Animal implements AnimalDeEstimacao {
    private String nome;
    public Cachorro(int pernas){
        super(pernas);
    }
    public Cachorro(String nome,int pernas){
        super(pernas);
        this.nome = nome;
    }
    @Override
    public void come(){
        System.out.println("O cachorro está comendo");
    }
    @Override
    public void caminha(){
        System.out.println("O cachorro está caminhando");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void brinca(){
        System.out.println("O cachorro está brincando!");
    }
}
