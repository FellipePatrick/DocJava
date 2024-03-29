package aplicacao;

import java.sql.Array;
import java.util.ArrayList;

public class Socio {
    private int cpf_s;
    private String nome_s;
    private String data_adm;
    private ArrayList<Dependentes> lista;
    public Socio(){
        lista = new ArrayList<Dependentes>();
    };
    public Socio(int cpf_s, String nome_s, String data_adm) {
        this.cpf_s = cpf_s;
        this.nome_s = nome_s;
        this.data_adm = data_adm;
    }

    public int getCpf_s() {
        return cpf_s;
    }

    public void setCpf_s(int cpf_s) {
        this.cpf_s = cpf_s;
    }

    public String getNome_s() {
        return nome_s;
    }

    public void setNome_s(String nome_s) {
        this.nome_s = nome_s;
    }

    public String getData_adm() {
        return data_adm;
    }

    public void setData_adm(String data_adm) {
        this.data_adm = data_adm;
    }
}
