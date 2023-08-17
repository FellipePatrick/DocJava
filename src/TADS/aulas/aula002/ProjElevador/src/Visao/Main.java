package Visao;

import Aplicacao.Elevador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevador elevador1 = new Elevador();
        elevador1.inicializar(10, 5);
        Scanner scanner = new Scanner(System.in);
        int op, capacidade, andares;
        boolean flag = false;
        do{
            System.out.println("\n1-Inicializar\n2-Entrar\n3-Sair\n4-Sobe\n5-Desce\n6-Encerra Programa:");
            op = scanner.nextInt();
            switch (op){
                case 1:
                    System.out.println("Bem-Vindo a inicalização do elevador!");
                    System.out.println("Digite o numero de andares: ");
                    andares = scanner.nextInt();
                    System.out.println("Digite a capacidade maxima do elevador: ");
                    capacidade = scanner.nextInt();
                    elevador1.inicializar(capacidade, andares);
                    flag = true;
                    break;
                case 2:
                    if(flag){
                        if(elevador1.entrar()){
                            System.out.println("Pessoa adicionada!");
                        }else{
                            System.out.println("O elevador esta cheio!");
                        }
                    }else{
                        System.out.println("Inicialize o Elevador!");
                    }
                    break;
                case 3:
                    if(flag){
                        if(elevador1.sai()){
                            System.out.println("Pessoa saiu");
                        }else{
                            System.out.println("O elevador não tem ninguem");
                        }
                    }else{
                        System.out.println("Inicialize o Elevador!");
                    }
                    break;
                case 4:
                    if(flag){
                        if(elevador1.sobe()){
                            System.out.println("O elevador subiu um andar");
                        }else{
                            System.out.println("O elevador já está no andar maximo");
                        }
                    }else{
                        System.out.println("Inicialize o Elevador!");
                    }
                    break;
                case 5:
                    if(flag){
                        if(elevador1.desce()){
                            System.out.println("O elevador desceu um andar");
                        }else{
                            System.out.println("O elevador está no terreo");
                        }
                    }else{
                        System.out.println("Inicialize o Elevador!");
                    }
                    break;
                case 6:
                    System.out.println("Fim do Programa!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }
        }while(op != 6);
    }
}