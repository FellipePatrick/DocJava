package controller;

public class Aluno {
    private String nome;
    private int matricula;
    private float n1, n2, n3, media;
    private String situacao;

    public Aluno(){

    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public float getN1() {
        return n1;
    }

    public float getN2() {
        return n2;
    }

    public float getN3() {
        return n3;
    }

    public float getMedia() {
        return media;
    }

    public String getSituacao() {
        if(this.media <= 3){
            return "Reprovado";
        } else if (this.media >= 4 && this.media <= 5) {
            return "Recuperação";
        } else if (this.media >= 6 && this.media <= 7) {
            return "Aprovado";
        }else{
            return "Aprovado com exito!";
        }
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setNotas(float n1, float n2, float n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void calcularMedia(){
        this.media = (this.n1+this.n2+this.n3)/3;
    }

    public String alterarNota(int codNota, float valorNota){
        if(codNota == 1){
            this.n1 = valorNota;
        } else if (codNota == 2) {
            this.n2 = valorNota;
        }else{
            this.n3 = valorNota;
        }
        return "Nota alterada";
    }

    public boolean buscarAluno(int matricula){
        if(matricula == this.matricula){
            return true;
        }
        return false;
    }

}
