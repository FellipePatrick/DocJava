package aplicacao;

public class Dependentes {
    private int id;
    private String nome_d;
    private int idade;
    private int cpf_s;
    public Dependentes(){};

    public Dependentes(int id, String nome_d, int idade, int cpf_s) {
        this.id = id;
        this.nome_d = nome_d;
        this.idade = idade;
        this.cpf_s = cpf_s;
    }
    public int getCpf_s() {
        return cpf_s;
    }
    public void setCpf_s(int cpf_s) {
        this.cpf_s = cpf_s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_d() {
        return nome_d;
    }

    public void setNome_d(String nome_d) {
        this.nome_d = nome_d;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
