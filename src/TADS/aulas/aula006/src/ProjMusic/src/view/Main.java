package view;
import controller.Musica;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int op, indice;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Musica> playList = new ArrayList<Musica>();
        boolean flag;
        String aux;
        Musica musica;
        do{
            System.out.println("\n------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\tPLAYLISTA");
            System.out.println("------------------------------------------------------------");
            System.out.print("1-Adicionar Musica\n2-Exluir Musica\n3-Tocar Musica Especifica\n4-Tocar Musicas do Cantor" +
                    "\n5-Tocar em sequencia\n6-Tocar embaralhadas\n7-Ver playlist\n8-Sair: ");
            op = teclado.nextInt();
            switch (op){
                case 1:
                    flag = false;
                    teclado.nextLine();
                    System.out.print("Digite o cantor da musica, o titulo e a sua duração em segundos: ");
                    musica = new Musica(teclado.nextLine(), teclado.nextLine(), teclado.nextInt());
                    for(Musica m: playList){
                        if(m.getCantor().equalsIgnoreCase(musica.getCantor()) && m.getTitulo().equalsIgnoreCase(musica.getTitulo())){
                            System.out.println("A musica não pode ser adicionada!");
                            flag = true;
                        }
                    }
                    if(!flag){
                        System.out.println("Musica adicionada!");
                        playList.add(musica);
                    }
                    break;
                case 2:
                    if(playList.size() > 0){
                        flag = false;
                        teclado.nextLine();
                        System.out.print("Digite o nome da musica que deseja excluir: ");
                        aux = teclado.nextLine();
                        indice = 0;
                        for(Musica m: playList){
                            if(m.getTitulo().equalsIgnoreCase(aux)){
                                flag = true;
                            }
                            if(!flag){
                                indice++;
                            }
                        }
                        if(flag){
                            playList.remove(indice);
                            System.out.println("Musica removida!");
                        }else{
                            System.out.println("Musica não encontrada!");
                        }
                    }else{
                        System.out.println("Nenhuma musica na PlayList!");
                    }
                    break;
                case 3:
                    if(playList.size() > 0){
                        flag = false;
                        teclado.nextLine();
                        System.out.print("Digite o nome da musica que deseja escutar: ");
                        aux = teclado.nextLine();
                        for(Musica m: playList){
                            if(m.getTitulo().equalsIgnoreCase(aux)){
                                flag = true;
                                indice = 0;
                                System.out.println("\nESTÁ TOCANDO A MUSICA" + m.getTitulo().toUpperCase());
                                for(int cont=0;cont<m.getDuracao(); cont++)
                                {
                                    try{
                                        Thread.sleep(1000);
                                    }catch(InterruptedException e){
                                        System.out.println("Erro na execução da música: "+e.getMessage());
                                    }
                                    System.out.println("|" + (m.getDuracao()-cont + " segundos"));
                                }
                            }
                        }
                        if(!flag){
                            System.out.println("Musica não encontrada!");
                        }
                    }else{
                        System.out.println("Nenhuma musica na PlayList!");
                    }
                    break;
                case 4:
                    if(playList.size() > 0){
                        flag = false;
                        teclado.nextLine();
                        System.out.print("Digite o nome do cantor da musica que deseja escutar: ");
                        aux = teclado.nextLine();
                        for(Musica m: playList){
                            if(m.getCantor().equalsIgnoreCase(aux)){
                                flag = true;
                                indice = 0;
                                System.out.println("\nESTÁ TOCANDO A MUSICA " + m.getTitulo().toUpperCase());
                                for(int cont=0;cont<m.getDuracao(); cont++)
                                {
                                    try{
                                        Thread.sleep(1000);
                                    }catch(InterruptedException e){
                                        System.out.println("Erro na execução da música: "+e.getMessage());
                                    }
                                    System.out.println("|" + (m.getDuracao()-cont + " segundos"));
                                }
                            }
                        }
                        if(!flag){
                            System.out.println("Musica não encontrada!");
                        }
                    }else{
                        System.out.println("Nenhuma musica na PlayList!");
                    }
                    break;
                case 5:
                    if(playList.size() > 0){
                        indice = 1;
                        for(Musica m: playList){
                            System.out.println("MUSICA " + indice + " " + m.getTitulo().toUpperCase());
                            for(int cont=0;cont<m.getDuracao(); cont++)
                            {
                                try{
                                    Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    System.out.println("Erro na execução da música: "+e.getMessage());
                                }
                                System.out.println("|" + (m.getDuracao()-cont + " segundos"));
                            }
                            indice++;
                        }
                    }else{
                        System.out.println("Nenhuma musica na PlayList!");
                    }
                    break;
                case 6:
                    if(playList.size() > 0){
                        Random random = new Random();
                        for(int i = 0; i < playList.size(); i++){
                            int numeroAleatorio = random.nextInt(playList.size());
                            System.out.println("MUSICA " + playList.get(numeroAleatorio).getTitulo().toUpperCase());
                            for(int cont=0;cont<playList.get(numeroAleatorio).getDuracao(); cont++)
                            {
                                try{
                                    Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    System.out.println("Erro na execução da música: "+e.getMessage());
                                }
                                System.out.println("|" + (playList.get(numeroAleatorio).getDuracao()-cont + " segundos"));
                            }
                        }
                    }else{
                        System.out.println("Nenhuma musica na PlayList!");
                    }
                    break;
                case 7:
                    if(playList.size() > 0){
                        for(Musica m: playList){
                            System.out.println("NOME: " + m.getTitulo() + " CANTO: " + m.getCantor() + " DURAÇÃO: " + m.getDuracao() + " segundos");
                        }
                    }else{
                        System.out.println("Nenhuma musica na PlayList!");
                    }
                    break;
                case 8:
                    System.out.println("Fim do Programa!");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }while(op!=8);
    }
}