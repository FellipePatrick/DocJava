package aplicacao;
public class Base {
    private int id;
    private String título;
    private int data;
    public Base(int id, String título, int data) {
        this.id = id;
        this.título = título;
        this.data = data;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTítulo() {
        return título;
    }
    public void setTítulo(String título) {
        this.título = título;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
}
