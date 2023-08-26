package views;
import controller.Aluno;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[3];
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        alunos[0] = a1;
        alunos[1] = a2;
        alunos[2] = a3;
        boolean flag;
        boolean[] vetorFlag = new boolean[2];
        float n;
        Scanner teclado = new Scanner(System.in);
        int op, cont;
        do{
            System.out.println("-----------------------------------");
            System.out.println("\t\t\tMENU PRINCIPAL");
            System.out.println("-----------------------------------");
            System.out.println("1-CADASTRAR ALUNOS\n2-CADASTRAR NOTAS\n3-CALCULAR MÉDIAS\n4-INFORMAR SITUAÇÕES" +
                    "\n5-INFORMAR DADOS DE UM ALUNO\n6-ALTERAR NOTA\n7-SAIR: ");
            op = teclado.nextInt();
            switch (op){
                case 1:
                    for(int i = 0; i < 3; i++) {
                        System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
                        alunos[i].setNome(teclado.next());
                        do {
                            System.out.println("Digite a matricula do aluno " + (i + 1) + ": ");
                            alunos[i].setMatricula(teclado.nextInt());
                            if (i == 0) {
                                flag = false;
                            } else {
                                flag = false;
                                for (int j = 0; j < i; j++) {
                                    if (alunos[j].buscarAluno(alunos[i].getMatricula())) {
                                        System.out.println("Essa matricula já existe no sistema!");
                                        flag = true;
                                    }
                                }
                            }
                        } while (flag);
                    }
                    break;
                case 2:
                    cont = 1;
                    if(a1.getNome()!=null){
                        for(Aluno aluno: alunos){
                            System.out.println("Digite as notas do aluno " + cont + ": ");
                            aluno.setNotas(teclado.nextFloat(), teclado.nextFloat(), teclado.nextFloat());
                            cont++;
                        }
                        vetorFlag[0] = true;
                    }else{
                        System.out.println("Nenhum aluno foi cadastrado!");
                    }
                    break;
                case 3:
                    if(vetorFlag[0]){
                        for (Aluno aluno:alunos) {
                            aluno.calcularMedia();
                        }
                        vetorFlag[1] = true;
                    }else{
                        System.out.println("Nenhuma nota foi cadastrada!");
                    }
                    break;
                case 4:
                    if(vetorFlag[1]){
                        cont = 1;
                        for (Aluno aluno:alunos) {
                            System.out.println("A situação do aluno " + cont + ": " + aluno.getSituacao());
                            cont++;
                        }
                    }else{
                        System.out.println("Nenhuma média foi cadastrada!");
                    }
                    break;
                case 5:
                    if (alunos[0].getNome()!=null){
                        System.out.println("Digite a matricula do aluno desejado: ");
                        cont = teclado.nextInt();
                        flag = false;
                        for(Aluno aluno:alunos){
                            if(aluno.buscarAluno(cont)){
                                flag = true;
                                System.out.println("Nome: " + aluno.getNome());
                                System.out.println("Matricula: " + aluno.getMatricula());
                                System.out.println("Situação: "+aluno.getSituacao());
                                System.out.println("Média: "+aluno.getMedia());
                            }
                        }
                        if(!flag){
                            System.out.println("Matricula não encontrada!");
                        }
                    }else{
                        System.out.println("Nenhum aluno foi cadastrado!");
                    }
                    break;
                case 6:
                    if (alunos[0].getNome()!=null){
                        System.out.println("Digite a matricula do aluno desejado: ");
                        cont = teclado.nextInt();
                        flag = false;
                        for(Aluno aluno:alunos){
                            if(aluno.buscarAluno(cont)){
                                flag = true;
                                System.out.println("Digite o codigo da nota de 1 a 3 e a nova nota: ");
                                aluno.alterarNota(teclado.nextInt(), teclado.nextFloat());
                            }
                        }
                        if(!flag){
                            System.out.println("Matricula não encontrada!");
                        }
                    }else{
                        System.out.println("Nenhum aluno foi cadastrado!");
                    }
                    break;
                case 7:
                    System.out.println("Fim do Programa!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }
        }while(op != 7);
        teclado.close();
    }
}