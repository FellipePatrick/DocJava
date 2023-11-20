package aplicacao;

public class Caminhao extends Veiculo implements I1{
    private String tipoLona;
    public Caminhao(int tamanho, int rodas, String chasi, int motor, float tanque, int qtdMarchas,String tipoLona) {
        super(tamanho, rodas, chasi, motor, tanque, qtdMarchas);
        this.tipoLona = tipoLona;
    }
    public String getTipoLona() {
        return tipoLona;
    }
    public void setTipoLona(String tipoLona) {
        this.tipoLona = tipoLona;
    }
    public String buzina(){
        return "BOM BOM";
    }
}
