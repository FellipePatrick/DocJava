package aplicacao;

public class CDs extends Base {
    private String genero;
    public CDs(int id, String título, int data, String genero) {
        super(id, título, data);
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
