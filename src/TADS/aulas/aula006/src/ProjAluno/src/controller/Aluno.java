package controller;

public class Aluno {
    private String matricula;
    private String nome;
    private float n1, n2, trabalho;

    public Aluno(){

    }
    public Aluno(String matricula, String nome, float n1, float n2, float trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.trabalho = trabalho;
    }
    private double finalNota(){
        if(media()>=5){
            return 0;
        }else{
            return (5 - media());
        }
    }
    private String estado(){
        return "Nome: " + this.nome + "\nMatricula: " +this.matricula +"\nMedia: " + media() + "\nNota final: " + finalNota();
    }
    public double media(){
        return (((this.n1 * 2.5)+(this.n2*2.5))/7);
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(float trabalho) {
        this.trabalho = trabalho;
    }
}
