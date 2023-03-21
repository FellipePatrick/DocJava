package ModuloCinco.oo.composicao.curso;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome;
    List<Curso> cursos = new ArrayList<>();
    public Aluno(String nome){
        this.nome = nome;
        this.cursos = new ArrayList<Curso>();
    }
    void adicionarCuso(Curso curso){
        this.cursos.add(curso);
    }
    Curso obterCurso(String nome){
        for(Curso curso: this.cursos){
            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }
    public String toString(){
        return nome;
    }
}
