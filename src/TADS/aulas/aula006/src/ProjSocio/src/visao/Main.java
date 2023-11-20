package visao;

import aplicacao.Socio;
import persistencia.SocioDAO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op, aux;
        ArrayList<Socio> listaSocios;
        SocioDAO sDao = new SocioDAO();
        Socio s;
        String auxS;
        Scanner teclado = new Scanner(System.in);
            do{
                System.out.println("\t  MENU PRINCIPAL\n----------------------------");
                System.out.println("1-Buscar Sócio\n2-Incluir Sócio\n3-Alterar Sócio\n4-Excluir Sócio" +
                        "\n5-Relatório de Sócios\n6-Sair do Sistema");
                op = teclado.nextInt();
                switch (op){
                    case 1:
                        System.out.println("Digite o CPF do Socio: ");
                        aux = teclado.nextInt();
                        if(sDao.selectPk(aux) != null){
                            s = sDao.selectPk(aux);
                            System.out.println("CPF: " + s.getCpf_s());
                            System.out.println("Nome: " + s.getNome_s());
                            System.out.println("Data Nascimento: " + s.getData_adm());
                            do{
                                System.out.println("\t  MENU SECUNDÁRIO\n----------------------------");
                                System.out.println("1-Buscar Dependente\n2-Incluir Dependente\n3-Alterar Dependente\n4-Excluir Dependente" +
                                        "\n5-Relatório de Dependente\n6-Voltar para o Menu Principal");
                                aux = teclado.nextInt();
                                switch (aux){
                                    case 1:
                                        System.out.println("BUSCAR DEPENDENTE");
                                        break;
                                    case 2:
                                        System.out.println("INCLUIR DEPENDENTE");
                                        break;
                                    case 3:
                                        System.out.println("ALTERAR DEPENDENTE");
                                        break;
                                    case 4:
                                        System.out.println("EXCLUIR DEPENDENTE");
                                        break;
                                    case 5:
                                        System.out.println("RELATÓRIO DE DEPENDENTE");
                                        break;
                                    case 6:
                                        System.out.println("Voltando ao menu principal");
                                        break;
                                    default:
                                        System.out.println("Opção Invalida!");
                                }
                            }while(aux!=6);
                        }else{
                            System.out.println("O cpf do socio não foi encontrado!");
                        }
                        break;
                    case 2:
                        s = new Socio();
                        System.out.println("Digite o CPF do Socio: ");
                        aux = teclado.nextInt();
                        if(sDao.selectPk(aux) == null){
                            s.setCpf_s(aux);
                            System.out.println("Digite o nome do Socio: ");
                            s.setNome_s(teclado.next());
                            System.out.println("Digite a data de nascimento do Socio(1999 05 22): ");
                            s.setData_adm(teclado.next());
                            sDao.insert(s);
                        }else{
                            System.out.println("O CPF já está cadastrado, por favor tente novamento com outro!");
                        }
                        break;
                    case 3:
                        System.out.println("Digite o CPF do Socio: ");
                        aux = teclado.nextInt();
                        if(sDao.selectPk(aux) != null){
                            s = sDao.selectPk(aux);
                            System.out.println("Deseja alterar o CPF(1-sim ou 2-não): ");
                            if(teclado.nextInt() == 1) {
                                do {
                                    System.out.println("Digite o novo CPF: ");
                                    op = teclado.nextInt();
                                    if (sDao.selectPk(op) == null) {
                                        System.out.println("O CPF ja esta cadastrado, Digite outro!");
                                    }
                                } while (sDao.selectPk(op) != null);
                                s.setCpf_s(op);
                            }
                            System.out.println("Deseja alterar o Nome(1-sim ou 2-não): ");
                            if(teclado.nextInt() == 1) {
                                System.out.println("Digite o novo nome: ");
                                s.setNome_s(teclado.next());
                            }
                            System.out.println("Deseja alterar a Data de Nascimento(1-sim ou 2-não): ");
                            if(teclado.nextInt() == 1) {
                                System.out.println("Digite a nova data de nascimento: ");
                                s.setData_adm(teclado.next());
                            }
                            sDao.update(aux, s);
                        }else{
                            System.out.println("O CPF já está cadastrado, por favor tente novamento com outro!");
                        }
                        break;
                    case 4:
                        System.out.println("Digite o CPF do Socio: ");
                        aux = teclado.nextInt();
                        if(sDao.selectPk(aux) != null){
                            sDao.delete(aux);
                            System.out.println("Socio deletado com sucesso!");
                        }else{
                            System.out.println("O CPF do socio não foi encontrado, por favor tente novamente!");
                        }
                        break;
                    case 5:
                        listaSocios = sDao.select();
                        if(listaSocios.size() != 0){
                            for(Socio x: listaSocios){
                                System.out.println("CPF: "+x.getCpf_s());
                                System.out.println("Nome: "+x.getNome_s());
                                System.out.println("Data Nascimento: "+x.getData_adm());
                            }
                        }else{
                            System.out.println("Nenhum Socio foi adicionado!");
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