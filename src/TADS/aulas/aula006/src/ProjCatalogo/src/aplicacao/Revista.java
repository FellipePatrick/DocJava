package aplicacao;

public class Revista extends Base{
    private int anoPub;
    private int volume;
    private String editora;
    public Revista(int id, String título, int data, int anoPub, int volume, String editora) {
        super(id, título, data);
        this.anoPub = anoPub;
        this.volume = volume;
        this.editora = editora;
    }
    public int getAnoPub() {
        return anoPub;
    }
    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
}
