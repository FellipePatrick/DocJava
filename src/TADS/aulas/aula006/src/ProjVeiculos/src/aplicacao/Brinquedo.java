package aplicacao;

public class Brinquedo extends Veiculo implements I1{
    private String marca;
    public Brinquedo(int tamanho, int rodas, String chasi, int motor, float tanque, int qtdMarchas, String marca) {
        super(tamanho, rodas, chasi, motor, tanque, qtdMarchas);
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String buzina() {
        return "clack clack";
    }
}
