package aplicacao;

public abstract class Veiculo {
    private int tamanho;
    private int rodas;
    private String chasi;
    private int motor;
    private float tanque;
    private int qtdMarchas;
    public Veiculo(int tamanho, int rodas, String chasi, int motor, float tanque, int qtdMarchas) {
        this.tamanho = tamanho;
        this.rodas = rodas;
        this.chasi = chasi;
        this.motor = motor;
        this.tanque = tanque;
        this.qtdMarchas = qtdMarchas;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public String getChasi() {
        return chasi;
    }
    public void setChasi(String chasi) {
        this.chasi = chasi;
    }
    public int getMotor() {
        return motor;
    }
    public void setMotor(int motor) {
        this.motor = motor;
    }
    public float getTanque() {
        return tanque;
    }
    public void setTanque(float tanque) {
        this.tanque = tanque;
    }
    public int getQtdMarchas() {
        return qtdMarchas;
    }
    public void setQtdMarchas(int qtdMarchas) {
        this.qtdMarchas = qtdMarchas;
    }
}
