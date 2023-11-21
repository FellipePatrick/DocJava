package visao;

import aplicacao.Dependentes;
import aplicacao.Socio;
import persistencia.DependentesDAO;
import persistencia.SocioDAO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op, aux;
        ArrayList<Socio> listaSocios;
        ArrayList<Dependentes> listaDependentes;
        SocioDAO sDao = new SocioDAO();
        Socio s;
        Dependentes d;
        DependentesDAO dDao = new DependentesDAO();
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
                                        System.out.println("Digite o ID do Dependente: ");
                                        aux = teclado.nextInt();
                                        if(dDao.selectId(aux, s.getCpf_s()) != null){
                                            d = dDao.selectId(aux, s.getCpf_s());
                                            System.out.println("ID: " + d.getId());
                                            System.out.println("Nome: " + d.getNome_d());
                                            System.out.println("CPF Socio: " + d.getCpf_s());
                                            System.out.println("Idade: " + d.getIdade());
                                        }else{
                                            System.out.println("ID não cadastrado, tente novamente!");
                                        }
                                        break;
                                    case 2:
                                        d = new Dependentes();
                                        System.out.println("Digite o ID do Dependente: ");
                                        aux = teclado.nextInt();
                                        if(dDao.selectAllId(aux) == null){
                                            d.setId(aux);
                                            d.setCpf_s(s.getCpf_s());
                                            System.out.println("Digite a idade do Dependente: ");
                                            d.setIdade(teclado.nextInt());
                                            System.out.println("Digite o nome do Dependente: ");
                                            d.setNome_d(teclado.next());
                                            dDao.insert(d);
                                            System.out.println("Dependente adicionado com Sucesso!");
                                        }else{
                                            System.out.println("Esse ID ja está cadastrado em outro Dependente, tente novamente!");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Digite o ID do Dependente: ");
                                        aux = teclado.nextInt();
                                        if(dDao.selectId(aux, s.getCpf_s()) != null){
                                            d = dDao.selectId(aux, s.getCpf_s());
                                            System.out.println("Deseja alterar o ID (1-sim ou 2-não): ");
                                            if(teclado.nextInt() == 1){
                                                do {
                                                    System.out.println("Digite o novo ID: ");
                                                    op = teclado.nextInt();
                                                    if (dDao.selectAllId(op) != null) {
                                                        System.out.println("O ID ja esta cadastrado, Digite outro!");
                                                    }
                                                } while (dDao.selectAllId(op) != null);
                                                d.setId(aux);
                                            }
                                            System.out.println("Deseja alterar o Nome (1-sim ou 2-não): ");
                                            if(teclado.nextInt() == 1){
                                                System.out.println("Digite o novo nome: ");
                                                d.setNome_d(teclado.next());
                                            }
                                            System.out.println("Deseja alterar o Idade (1-sim ou 2-não): ");
                                            if(teclado.nextInt() == 1){
                                                System.out.println("Digite a nova Idade: ");
                                                d.setIdade(teclado.nextInt());
                                            }
                                            dDao.update(d.getId(), d.getCpf_s(), d);
                                            System.out.println("Dependente Alterado com sucesso!");
                                        }else {
                                            System.out.println("O ID não está cadastrado, por favor tente novamento com outro!");
                                        }
                                        break;
                                    case 4:
                                        System.out.println("Digite o ID do Dependente: ");
                                        aux = teclado.nextInt();
                                        if(dDao.selectId(aux, s.getCpf_s()) != null){
                                            dDao.delete(aux, s.getCpf_s());
                                            System.out.println("Dependente deletado com sucesso!");
                                        }else{
                                            System.out.println("O ID do Dependente não foi encontrado, por favor tente novamente!");
                                        }
                                        break;
                                    case 5:
                                        listaDependentes = dDao.select(s.getCpf_s());
                                        if(listaDependentes.size() != 0){
                                            for(Dependentes x: listaDependentes){
                                                System.out.println("ID: "+x.getId());
                                                System.out.println("Nome: "+x.getNome_d());
                                                System.out.println("CPF do Socio: " + x.getCpf_s());
                                                System.out.println("Idade: "+x.getIdade());
                                            }
                                        }else{
                                            System.out.println("Nenhum Dependente foi adicionado!");
                                        }
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
                            System.out.println("Digite a data de nascimento do Socio(1999-05-22): ");
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
                                    if (sDao.selectPk(op) != null) {
                                        System.out.println("O CPF ja esta cadastrado, Digite outro!");
                                    }
                                } while (sDao.selectPk(op) != null);
                                dDao.updateAll(s.getCpf_s(), 0);
                                s.setCpf_s(op);
                                sDao.update(aux, s);
                                dDao.updateAll(0, s.getCpf_s());
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
                            System.out.println("O CPF não está cadastrado, por favor tente novamento com outro!");
                        }
                        break;
                    case 4:
                        System.out.println("Digite o CPF do Socio: ");
                        aux = teclado.nextInt();
                        if(sDao.selectPk(aux) != null){
                            s = sDao.selectPk(aux);
                            dDao.deleteCpf(s.getCpf_s());
                            sDao.delete(s.getCpf_s());
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