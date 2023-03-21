package ModuloCinco.oo.composicao.curso;

public class testeCursos {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fellipe");
        Aluno aluno2 = new Aluno("Patrick");

        Curso curso1 = new Curso("POO");
        Curso curso2 = new Curso("RL");

        aluno1.adicionarCuso(curso1);
        aluno2.adicionarCuso(curso2);

        curso1.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno2);

        for(Aluno aluno: curso1.alunos){
            System.out.println(aluno.nome);
        }
        System.out.println(aluno1.cursos.get(0).alunos);

        System.out.println(curso1.obterAluno("fell2ipe"));
    }
}
