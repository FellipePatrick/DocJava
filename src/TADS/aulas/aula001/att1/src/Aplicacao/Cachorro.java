package Aplicacao;

public class Cachorro {
    private String nome, raca;

    private int idade;

    public String getNome() {
        return this.nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void comer(){
        System.out.println("O cachorro está comendo");
    };

    void dormir(){
        System.out.println("O cachorro está dormindo");
    };

    void passear(){
        System.out.println("O cachorro ficou feliz");
    };

}
