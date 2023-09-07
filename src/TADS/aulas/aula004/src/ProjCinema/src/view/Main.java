package view;

import controller.Ingresso;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[10][12];
        String s;
        for (int i = 0; i < 10; i++){
            for(int j = 0; j < 12; j++){
                matriz[i][j] = 0;
            }
        }
        int aux, x, y;
        boolean flag;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Ingresso> lista = new ArrayList<Ingresso>();
        do{
            System.out.println("Bilheteria");
            System.out.print("1-Comprar Ingresso\n2-Alterar Ingresso\n3-Desistir do Ingresso\n4-Sair: ");
            aux = teclado.nextInt();
            switch (aux){
                case 1:
                    if(matriz.length <= 120){
                        flag = false;
                        Ingresso ingresso = new Ingresso();
                        System.out.print("Digite seu cpf: ");
                        ingresso.setCpfCliente(teclado.next());
                        teclado.nextLine();
                        System.out.print("Digite o nome do filme: ");
                        ingresso.setNomeFilme(teclado.nextLine());
                        System.out.print("Você é estudante(S-sim N-não): ");
                        if(teclado.next().equalsIgnoreCase("S")){
                            ingresso.setValorIngresso(8);
                        }else{
                            ingresso.setValorIngresso(16);
                        }
                        System.out.print("Digite a fila da poltrona(1 a 10): ");
                        x = teclado.nextInt()-1;
                        System.out.print("Digite a coluna da poltrona(1 a 12): ");
                        y = teclado.nextInt()-1;
                        if(matriz[x][y] == 0){
                            matriz[x][y] = 1;
                            if(x == 0){
                                x+=y;
                            }else{
                                x*=y;
                            }
                            ingresso.setNumeroPoltrona((x));
                        }else{
                            System.out.println("Essa poltrona já está ocupada!");
                        }
                        lista.add(ingresso);
                    }else{
                        System.out.println("A sala está cheia");
                    }
                    break;
                case 2:
                    flag = false;
                    System.out.print("Digite o cpf: ");
                    s = teclado.next();
                    for(Ingresso i: lista){
                        if(s.equalsIgnoreCase(i.getCpfCliente())){
                            flag = true;
                            System.out.println("Digite o novo cpf: ");
                            i.setCpfCliente(teclado.next());
                        }
                    }
                    if(!flag){
                        System.out.println("Ingresso não foi encontrado!");
                    }
                    break;
                case 3:
                    flag = false;
                    System.out.print("Digite o cpf: ");
                    s = teclado.next();
                    for(Ingresso i: lista){
                        if(s.equalsIgnoreCase(i.getCpfCliente())){
                            flag = true;
                            System.out.println("O ingresso com codigo " + i.getCodigoIngresso() + " foi removido!");
                            lista.remove(i);
                        }
                    }
                    if(!flag){
                        System.out.println("Ingresso não foi encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("Fim do Programa!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }
        }while(aux!=4);
        teclado.close();
    }
}