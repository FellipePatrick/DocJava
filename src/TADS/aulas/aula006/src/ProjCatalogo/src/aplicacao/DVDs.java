package aplicacao;

public class DVDs extends Base{
    private String tipo;
    public DVDs(int id, String título, int data, String tipo) {
        super(id, título, data);
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
