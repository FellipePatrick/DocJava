package view;

import controller.Country;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Country> lista = new ArrayList<Country>();
        int op = 0;
        String auxN;
        boolean flag;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("\n1-Adicionar país\n2-Comparar países\n3-Adicionar fronteira\n4-Retorna fronteiras\n5-Fronteiras em comum\n6-Sair: ");
            op = teclado.nextInt();
            switch (op){
                case 1:
                    teclado.nextLine();
                    System.out.print("Digite o nome do país, capital e o tamanho: ");
                    Country p = new Country(teclado.nextLine(), teclado.nextLine() ,teclado.nextDouble());
                    lista.add(p);
                    System.out.println("País adicionado!");
                    break;
                case 2:
                    if(lista.size() > 0){
                        teclado.nextLine();
                        System.out.print("Digite o nome do país, tamanho e capital: ");
                        Country pT = new Country(teclado.nextLine(), teclado.nextLine() ,teclado.nextDouble());
                        teclado.nextLine();
                        System.out.print("Digite o nome do outro país, tamanho e capital: ");
                        Country px =new Country(teclado.nextLine(), teclado.nextLine() ,teclado.nextDouble());
                        if(px.equals(pT)){
                            System.out.println("Países iguais!");
                        }else{
                            System.out.println("Países diferentes!");
                        }
                    }else{
                        System.out.println("Nenhum páis foi cadastrado!");
                    }
                    break;
                case 3:
                    if(lista.size() > 0){
                        teclado.nextLine();
                        System.out.print("Digite o nome do país que você quer adicionar fronteira: ");
                        auxN = teclado.nextLine();
                        flag = false;
                        for(Country pa: lista){
                            if(pa.getNome().equalsIgnoreCase(auxN)){
                                flag = true;
                                System.out.print("Digite o nome do país da fronteira, capital e o tamanho: ");
                                Country pv = new Country(teclado.nextLine(), teclado.nextLine() ,teclado.nextDouble());
                                if(pa.adicionaFronteira(pv)){
                                    System.out.println("País adicionado!");
                                }else{
                                    System.out.println("País não adicionado!");
                                }
                            }
                        }
                        if(!flag){
                            System.out.println("País não encontrado!");
                        }
                    }else{
                        System.out.println("Nenhum páis foi cadastrado!");
                    }
                    break;
                case 4:
                    if(lista.size() > 0){
                        teclado.nextLine();
                        System.out.print("Digite o nome do país que você quer listar as fronteiras: ");
                        auxN = teclado.nextLine();
                        flag = false;
                        for(Country pa: lista){
                            if(pa.getNome().equalsIgnoreCase(auxN)){
                                flag = true;
                                if(pa.listarFronteira().size() > 0){
                                    System.out.println("FRONTEIRAS DO " + pa.getNome().toUpperCase());
                                    System.out.println("NOME\tCAPITAL\tTAMANHO");
                                    for(int i = 0; i < pa.listarFronteira().size(); i++){
                                        System.out.println(pa.listarFronteira().get(i).getNome() + "\t" + pa.listarFronteira().get(i).getCapital() + "\t" + pa.listarFronteira().get(i).getTamanho() );
                                    }
                                }
                            }
                        }
                        if(!flag){
                            System.out.println("País não encontrado!");
                        }
                    }else{
                        System.out.println("Nenhum páis foi cadastrado!");
                    }
                    break;
                case 5: // Rever esse metodo, pois não está funcionando
                    if(lista.size() > 0){
                        teclado.nextLine();
                        System.out.println("Digite o nome do país que você quer comparar as fronteiras: ");
                        auxN = teclado.nextLine();
                        flag = false;
                        for(Country pa: lista){
                            if(pa.getNome().equalsIgnoreCase(auxN)){
                                flag = true;
                                System.out.println("Digite o nome do outro país que você quer comparar as fronteiras: ");
                                auxN = teclado.nextLine();
                                for(Country pe: lista){
                                    if(pe.getNome().equalsIgnoreCase(auxN)){
                                        if(pa.listarFronteira().size() > 0 && pe.listarFronteira().size() > 0) {
                                            flag = false;
                                            ArrayList<Country> n = new ArrayList<Country>();
                                            System.out.println("FRONTEIRAS EM COMUM");
                                            System.out.println("NOME\tCAPITAL\tTAMANHO");
                                            n = pa.fronteiras(pe);
                                            for(int i = 0; i < n.size(); i++){
                                                System.out.println(n.get(i).getNome() + "\t" + n.get(i).getCapital() + "\t" + n.get(i).getTamanho() );
                                            }
                                        }else{
                                            System.out.println("Não foi possivel comparar as fronteiras!");
                                        }
                                    }
                                }
                                if(flag){
                                    System.out.println("O segundo país não foi encontrado!");
                                }else{
                                    flag = true;
                                }
                            }
                        }
                        if(!flag){
                            System.out.println("País não encontrado!");
                        }
                    }else{
                        System.out.println("Nenhum páis foi cadastrado!");
                    }
                    break;
                case 6:
                    System.out.println("Fim do programa!");
                default:
            }
        }while(op != 6);
    }
}