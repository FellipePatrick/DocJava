package view;

import controller.Pedido;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pedido> lista = new ArrayList<Pedido>();
        int op, util;
        boolean[] flag = new boolean[2];
        boolean pflag = false;
        String aux;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("--------------------------------------------------");
            System.out.println("\t\t\t\tBotijão do Zé");
            System.out.println("--------------------------------------------------");
            System.out.print("\n1-Fazer Pedido\n\n2-Confirmar Entrega\n\n3-Listar Pedidos\n\n4-Sair:");
            op = teclado.nextInt();
            switch (op){
                case 1:
                    Pedido p = new Pedido();
                    do{
                        aux = teclado.nextLine();
                        System.out.print("Digite o endereço de entrega: ");
                        aux = teclado.nextLine();
                        p.setEndereco(aux);
                        System.out.print("Digite a hora da compra: ");
                        p.setHoraCompra(teclado.nextInt());
                        System.out.println("Endereço da entrega: " + p.getEndereco());
                        System.out.println("Hora da compra: " + p.getHoraCompra());
                        System.out.print("Você quer confirmar esse pedido (S-sim ou n-não): ");
                        aux = teclado.next();
                        if(aux.equalsIgnoreCase("n")){
                            System.out.println("Repita novamente os dados abaixo!");
                        }
                    }while(aux.equalsIgnoreCase("n"));
                    System.out.print("Informe a quantidade de butijões: ");
                    p.setQuantidade(teclado.nextInt());
                    System.out.print("Informe o numero do cartão: ");
                    p.setCartaoCredito(teclado.nextInt());
                    p.setStatus(true);
                    System.out.println("Pedido Confirmado!");
                    System.out.println("codigo do pedido: " + p.getCodigoPedido());
                    lista.add(p);
                    pflag = true;
                    break;
                case 2:
                    if(pflag){
                        flag[0] = false;
                        System.out.println("Digite o codigo do pedido: ");
                        util = teclado.nextInt();
                        for(Pedido pedido: lista){
                            if(pedido.buscaCodigo(util)){
                                flag[0] = true;
                                if(pedido.getStatus()){
                                    System.out.println("Pedido entregue!");
                                    flag[1] = true;
                                    pedido.setStatus(false);
                                }else{
                                    System.out.println("O pedido já foi entregue!");
                                }
                            }
                        }
                        if(!flag[0]){
                            System.out.println("Pedido não localizado!");
                        }
                    }else{
                        System.out.println("Nenhum pedido foi cadastrado!");
                    }
                    break;
                case 3:
                    if(pflag){
                        int cont = 1;
                        for(Pedido pedido: lista){
                            System.out.println("-----------------------------------------------------------");
                            System.out.println("Pedido " + cont);
                            System.out.println("Endereço: " + pedido.getEndereco());
                            System.out.println("Hora de compra: " + pedido.getHoraCompra() + "| Hora de entrega: " + pedido.getHoraEntrega());
                            if(pedido.getStatus()){
                                System.out.println("Status: Aguardando Entrega");
                            }else{
                                System.out.println("Pedido Entregue!");
                            }
                            System.out.println("Quantidade de bojões: " + pedido.getQuantidade());
                            System.out.println("Valor: " + pedido.getTotalCompras() + "R$");
                            cont++;
                        }
                    }else{
                        System.out.println("Nenhum pedido cadastrado!");
                    }
                    break;
                case 4:
                    System.out.println("Fim do Programa!");
                default:
                    System.out.println("Opção Invalida!");
            }
        }while(op!=4);
    }
}