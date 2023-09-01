package view;

import controller.Robo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Robo r1 = new Robo(1);
        int op;
        char[][] mapa = new char[20][40];
        Scanner teclado = new Scanner(System.in);
       do{
           System.out.print("\n1-Ver Posição atual\n2-Andar para frente\n3-Andar para trás\n4-Andar para direita\n5-Andar para Esquerda\n6-Sair: ");
           op = teclado.nextInt();
           switch (op){
               case 1:
                   System.out.println("Posição atual: " + r1.mostrarPosicaoAtual());
                   break;
               case 2:
                   if((r1.getLinha()+r1.getPasso()) > 20){
                       System.out.println("Você já está na borda do mapa, não pode andar para frente!");
                   }else{
                       r1.andarFrente();
                   }
                   break;
               case 3:
                   if((r1.getLinha()-r1.getPasso()) < 0){
                       System.out.println("Você já está na borda do mapa, não pode andar para trás!");
                   }else{
                       r1.andarTras();
                   }
                   break;
               case 4:
                   if((r1.getColuna()+r1.getPasso())>40){
                       System.out.println("Você já está na borda do mapa, não pode andar para direita!");
                   }else{
                       r1.andarDireita();
                   }
                   break;
               case 5:
                   if((r1.getColuna()-r1.getPasso()) < 0){
                       System.out.println("Você já está na borda do mapa, não pode andar para esquerda!");
                   }else{
                       r1.andarEsquerda();
                   }
                   break;
               case 6:
                   System.out.println("Fim do Programa!");
                   break;
               default:
                   System.out.println("Opção Invalida!");
           }
           for(int i = 0; i < 20;i++){
               System.out.println();
               for(int j = 0; j < 40; j++){
                   if(r1.getLinha() == i && r1.getColuna() == j){
                       System.out.print("1");
                   }else{
                       System.out.print("-");
                   }
               }
           }
       }while(op!=6);
       teclado.close();
    }
}