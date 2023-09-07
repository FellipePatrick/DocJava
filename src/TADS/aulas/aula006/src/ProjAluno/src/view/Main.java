package view;

import controller.Aluno;
import controller.Disciplina;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op, aux;
        String n;
        boolean flag, flagAluno = false;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Disciplina> lista = new ArrayList<Disciplina>();
        Disciplina disciplina;
        do{
            System.out.print("1-Adicionar Disciplina\n2-Adicionar Aluno\n3-Consultar Melhor Aluno\n4-Ver Disciplina\n5-Trocar Professor\n6-Ver Media dos Alunos\n7-Encontrar Aluno\n8-Sair: ");
            op = teclado.nextInt();
            switch (op){
                case 1:
                    disciplina = new Disciplina(lista.size()+1);
                    teclado.nextLine();
                    System.out.print("\nDigite o nome da disciplina: ");
                    n = teclado.nextLine();
                    System.out.print("\nDigite a carga horaria da disciplina: ");
                    aux = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("\nDigite o nome do professor da disciplina: ");
                    disciplina.InserirDisciplina(n, aux, teclado.nextLine());
                    lista.add(disciplina);
                    break;
                case 2:
                    if(lista.size() != 0){
                        Aluno aluno;
                        flag = false;
                        System.out.print("Digite o codigo da disciplina que deseja adicionar o aluno: ");
                        aux = teclado.nextInt();
                        for(Disciplina d: lista){
                            if(d.getCodigo() == aux){
                                flag = true;
                                System.out.println("Digite o nome, matricula, nota 1 e 2, e a nota do trabalho: ");
                                n = teclado.nextLine();
                                aluno = new Aluno(n, teclado.next(), teclado.nextFloat(), teclado.nextFloat(), teclado.nextFloat());
                                d.InserirAluno(aluno);
                            }
                        }
                        if(!flag){
                            System.out.println("Disciplina não encontrada!");
                        }
                    }else{
                        System.out.println("Nenhum disciplina cadastrado!");
                    }
                    break;
                case 3:
                    flag = false;
                    System.out.print("Digite o codigo da Disciplina que deseja ver o melhor aluno: ");
                    aux = teclado.nextInt();
                    for(Disciplina d: lista){
                        if(d.getCodigo() == aux){
                            flag = true;
                            n = d.MelhorAluno();
                            if(n == " "){
                                System.out.println("Nenhum aluno foi cadastrado na turma!");
                            }else{
                                System.out.println("O melhor aluno é: " + d.melhorAluno().getNome() + " media: " + d.melhorAluno().media());
                            }
                          }
                        }
                    if(!flag){
                        System.out.println("Disciplina não encontrada!");
                    }
                    break;
                case 4:
                    n = teclado.nextLine();
                    flag = false;
                    System.out.print("Digite o nome da Disciplina que deseja ver: ");
                    n = teclado.nextLine();
                    for(Disciplina d: lista){
                        if(d.getTitulo().equalsIgnoreCase(n)){
                            flag = true;
                            System.out.println(d.getDados());
                            System.out.println("LISTA DE ALUNOS");
                            if(d.getLista().size() > 0){
                                System.out.println("NOME\tMATRICULA\tMEDIA");
                                for(int i = 0; i < d.getLista().size(); i++){
                                    System.out.println(d.getLista().get(i).getNome() + "\t" + d.getLista().get(i).getMatricula()+ "\t" + d.getLista().get(i).media());
                                }
                            }else{
                                System.out.println("Nenhum aluno foi cadastrado!");
                            }
                        }
                    }
                    if(!flag){
                        System.out.println("Disciplina não encontrada!");
                    }
                    break;
                case 5:
                    flag = false;
                    System.out.print("Digite o codigo da Disciplina que trocar o professor: ");
                    aux = teclado.nextInt();
                    for(Disciplina d: lista){
                        if(d.getCodigo() == aux){
                            teclado.nextLine();
                            flag = true;
                            System.out.print("Digite o nome do novo professor: ");
                            d.setNomeProfessor(teclado.nextLine());
                        }
                    }
                    if(!flag){
                        System.out.println("Disciplina não encontrada!");
                    }
                    break;
                case 6:
                    flag = false;
                    System.out.print("Digite o codigo da Disciplina que ver a media dos alunos: ");
                    aux = teclado.nextInt();
                    for(Disciplina d: lista){
                        flag = true;
                        if(d.getCodigo() == aux){
                            if(d.media() == -1){
                                System.out.println("Nenhuma nota foi cadastrada!");
                            }else{
                                System.out.println("A media da turma: " + d.media());
                            }
                        }
                    }
                    if(!flag){
                        System.out.println("Disciplina não encontrada!");
                    }
                    break;
                case 7:
                    flag = false;
                    teclado.nextLine();
                    System.out.print("Digite a matricula do aluno: ");
                    n = teclado.nextLine();
                    for(Disciplina d: lista){
                        if(d.consultarAluno(n) != " "){
                            flag = true;
                            d.consultarAluno(n);
                        }
                    }
                    if(!flag){
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 8:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção invalida");

            }
        }while(op != 8);
        teclado.close();
    }
}