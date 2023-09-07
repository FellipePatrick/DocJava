package controller;

public class Musica {
    private String cantor;
    private String titulo;
    private int duracao;
    public Musica(String cantor, String titulo, int duracao) {
        this.cantor = cantor;
        this.titulo = titulo;
        this.duracao = duracao;
    }
    public String getCantor() {
        return cantor;
    }
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
