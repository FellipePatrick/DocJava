package aplicacao;

public class Carro extends Veiculo implements I1{
    private int nPortas;
    public Carro(int tamanho, int rodas, String chasi, int motor, float tanque, int qtdMarchas, int nPortas) {
        super(tamanho, rodas, chasi, motor, tanque, qtdMarchas);
    }
    @Override
    public String buzina() {
        return "PamPam";
    }
    public int getnPortas() {
        return nPortas;
    }
    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }
}
