package view;
import controller.Contato;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Contato> lista = new ArrayList<Contato>();
        int op, op2;
        Scanner teclado = new Scanner(System.in);
        Contato contato, auxC = new Contato();
        boolean flag = false;
        String aux;
        do{
            System.out.println("AGENDA DE CONTATOS");
            System.out.print("1-Cadastrar pessoa\n2-Remover pessoa\n3-Buscar pessoa\n" +
                    "4-Informar um dado\n5-Listar Todos\n6-Sair: ");
            op = teclado.nextInt();
            switch (op){
                case 1:
                    contato = new Contato();
                    teclado.nextLine();
                    System.out.print("Informe o nome da pessoa: ");
                    contato.setNome(teclado.nextLine());
                    System.out.print("Informe o email da pessoa: ");
                    contato.setEmail(teclado.nextLine());
                    System.out.print("Informe o telefone da pessoa: ");
                    contato.setTelefone(teclado.nextLine());
                    lista.add(contato);
                    System.out.println("Contato Adicionado Com Sucesso!");
                    flag = true;
                    break;
                case 2:
                    if(lista.size() != 0){
                        flag = false;
                        aux = teclado.nextLine();
                        System.out.print("Digite o telefone da pessoa que deseja excluir: ");
                        aux = teclado.nextLine();
                        for(Contato contatos: lista){
                            if(contatos.getTelefone().equalsIgnoreCase(aux)){
                                auxC = contatos;
                                System.out.println("Contato excluido!");
                                flag = true;
                            }
                        }
                        if(flag){
                            System.out.println("Contato não encontrado!");
                        }else{
                            lista.remove(auxC);
                        }
                    }else{
                        System.out.println("Sua agenda está vazia!");
                    }
                    break;
                case 3:
                    if(lista.size() != 0){
                        flag = false;
                        aux = teclado.nextLine();
                        System.out.print("Digite o nome da pessoa: ");
                        aux = teclado.nextLine();
                        for(Contato contatos: lista){
                            if(contatos.getNome().equalsIgnoreCase(aux)){
                                System.out.println("AGENDA DE CONTATOS\n");
                                System.out.println("Nome - " + contatos.getNome());
                                System.out.println("Email -" + contatos.getEmail());
                                System.out.println("Telefone -" + contatos.getTelefone() + "\n");
                                flag = true;
                            }
                        }
                        if(flag){
                            System.out.println("Contato não encontrado!");
                        }
                    }else{
                        System.out.println("Sua agenda está vazia!");
                    }
                    break;
                case 4:
                    System.out.println("Escolha qual opção você quer buscar\n1-Nome\n2-Email\n3-Telefone: ");
                    op2 = teclado.nextInt();
                    flag = false;
                    aux = teclado.nextLine();
                    switch (op2){
                        case 1:
                            System.out.print("Digite o nome da pessoa: ");
                            aux = teclado.nextLine();
                            for(Contato contatos: lista){
                                if(contatos.getNome().equalsIgnoreCase(aux)){
                                    System.out.println("AGENDA DE CONTATOS\n");
                                    System.out.println("Nome - " + contatos.getNome());
                                    System.out.println("Email -" + contatos.getEmail());
                                    System.out.println("Telefone -" + contatos.getTelefone() + "\n");
                                    flag = true;
                                }
                            }
                            if(flag){
                                System.out.println("Contato não encontrado!");
                            }
                            break;
                        case 2:
                            System.out.print("Digite o email da pessoa: ");
                            aux = teclado.nextLine();
                            for(Contato contatos: lista){
                                if(contatos.getEmail().equalsIgnoreCase(aux)){
                                    System.out.println("AGENDA DE CONTATOS\n");
                                    System.out.println("Nome - " + contatos.getNome());
                                    System.out.println("Email -" + contatos.getEmail());
                                    System.out.println("Telefone -" + contatos.getTelefone() + "\n");
                                    flag = true;
                                }
                            }
                            if(flag){
                                System.out.println("Contato não encontrado!");
                            }
                            break;
                        case 3:
                            System.out.print("Digite o telefone da pessoa: ");
                            aux = teclado.nextLine();
                            for(Contato contatos: lista){
                                if(contatos.getNome().equalsIgnoreCase(aux)){
                                    System.out.println("AGENDA DE CONTATOS\n");
                                    System.out.println("Nome - " + contatos.getNome());
                                    System.out.println("Email -" + contatos.getEmail());
                                    System.out.println("Telefone -" + contatos.getTelefone() + "\n");
                                    flag = true;
                                }
                            }
                            if(flag){
                                System.out.println("Contato não encontrado!");
                            }
                            break;
                        default:
                            System.out.println("Opção Invalida!");
                    }
                    if(lista.size() != 0){
                        System.out.println("AGENDA DE CONTATOS");
                        for(Contato contatos: lista){
                            System.out.println("\nNome - " + contatos.getNome());
                            System.out.println("Email -" + contatos.getEmail());
                            System.out.println("Telefone -" + contatos.getTelefone() + "\n");
                        }
                    }else{
                        System.out.println("Sua agenda está vazia!");
                    }
                    break;
                case 5:
                    if(lista.size() != 0){
                        System.out.println("AGENDA DE CONTATOS");
                        for(Contato contatos: lista){
                            System.out.println("\nNome - " + contatos.getNome());
                            System.out.println("Email -" + contatos.getEmail());
                            System.out.println("Telefone -" + contatos.getTelefone() + "\n");
                        }
                    }else{
                        System.out.println("Sua agenda está vazia!");
                    }
                    break;
                case 6:
                    System.out.println("Fim do Programa!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }
        }while(op!=6);
        teclado.close();
    }
}