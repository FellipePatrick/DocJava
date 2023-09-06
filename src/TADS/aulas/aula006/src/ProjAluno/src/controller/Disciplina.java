package controller;

import java.util.ArrayList;
import java.util.Stack;

public class Disciplina {
    private ArrayList<Aluno> lista = new ArrayList<Aluno>();
    private Aluno aux = new Aluno();
    public Aluno ex;
    private double auxD = 0;
    private boolean flag;
    private int codigo;
    private String titulo;
    private int cargaHoraria;
    private String nomeProfessor;
    public Disciplina(int codigo){
        this.codigo = codigo;
    }
    public String getDados(){
        return "codigo: " + this.codigo + "\ntitulo: " + this.titulo + "\nCarga Horaria: " + this.cargaHoraria + "\nProfessor: " + this.nomeProfessor;
    }

   public String MelhorAluno(){
       if(lista.size() > 0){
           Aluno a = new Aluno();
           flag = false;
           a.setN1(2);
           a.setN2(3);
           a.setTrabalho(5);
           for(Aluno aluno: lista){
               if(a.media() < aluno.media()){
                   flag = true;
                   a = aluno;
               }
           }
           return a.getNome() + " " + " media: " + a.media();
       }else{
           return " ";
       }
   }
    public String consultarAluno(String matricula){
        for(Aluno aluno: lista){
            if(aluno.getMatricula().equalsIgnoreCase(matricula)){
                return "Nome: " + aluno.getNome() + "\nMatricula: " + aluno.getMatricula() + "\nMedia: " + aluno.media();
            }
        }
        return " ";
    }
    public void alterarProfessor(String nomeProfessor){
        this.nomeProfessor = nomeProfessor;
    }
    public void InserirDisciplina( String titulo, int cargaHoraria, String nomeProfessor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
        this.nomeProfessor = nomeProfessor;
    }
   public void InserirAluno(Aluno aluno){
        lista.add(aluno);
   }

    public ArrayList<Aluno> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Aluno> lista) {
        this.lista = lista;
    }

    public Aluno melhorAluno(){
        aux = lista.get(0);
        for(Aluno aluno: lista){
            if(aux.media() < aluno.media()){
                aux = aluno;
            }
        }
        return aux;
    }
    public double media(){
        if (lista.size() > 0){
            for(Aluno aluno: lista){
                auxD += aluno.media();
            }
            return auxD/lista.size();
        }else{
            return -1;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
}
