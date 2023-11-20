package aplicacao;

public class Motocicleta extends Veiculo implements I1{
    private String tipoCorrente;
    public Motocicleta(int tamanho, int rodas, String chasi, int motor, float tanque, int qtdMarchas, String tCorrente) {
        super(tamanho, rodas, chasi, motor, tanque, qtdMarchas);
        this.tipoCorrente = tCorrente;
    }
    public void setTipoCorrente(String corrente){
        this.tipoCorrente = corrente;
    }
    public String getTipoCorrente(){
        return this.tipoCorrente;
    }
    @Override
    public String buzina() {
        return "Bibibi";
    }
}
