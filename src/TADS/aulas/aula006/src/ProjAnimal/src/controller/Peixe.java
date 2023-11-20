package controller;

public class Peixe extends Animal implements AnimalDeEstimacao{
    private String nome;
    public Peixe(int pernas){
        super(pernas);
    }
    @Override
    public void come() {
        System.out.println("O peixe está comendo!");
    }
    @Override
    public void caminha() {
        System.out.println("O peixe está nadando!");
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void brinca(){
        System.out.println("O peixe está brincando!");
    }
}
