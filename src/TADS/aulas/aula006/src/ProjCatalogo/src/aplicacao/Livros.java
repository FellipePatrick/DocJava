package aplicacao;

public class Livros extends Base{
    private int anoPub;
    private String nomeEditora;
    public Livros(int id, String título, int data, String nomeEditora, int anoPub) {
        super(id, título, data);
        this.anoPub = anoPub;
        this.nomeEditora = nomeEditora;
    }
    public int getAnoPub() {
        return anoPub;
    }
    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }
    public String getNomeEditora() {
        return nomeEditora;
    }
    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }
}
