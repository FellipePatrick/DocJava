package ModuloCinco.composicao.muitosparamuitos;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Paulo");
        Aluno aluno3 = new Aluno("José");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Python");

        curso1.adicionarAluno(aluno3);
        curso1.adicionarAluno(aluno2);

        aluno1.adicionarCurso(curso2);
        aluno3.adicionarCurso(curso2);
        aluno2.adicionarCurso(curso2);
    }
}
