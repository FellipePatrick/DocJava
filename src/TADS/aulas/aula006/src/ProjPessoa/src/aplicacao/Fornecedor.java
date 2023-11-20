package aplicacao;

public class Fornecedor extends Pessoa{
    private float valorCredito;
    private float  valorDivida;
    public Fornecedor(String nome, String endereço, int telefone, float vC, float vD){
        super(nome, endereço, telefone);
        this.valorCredito = vC;
        this.valorDivida = vD;
    }
    public float obterSaldo(){
        return this.valorCredito - this.valorDivida;
    }

    public float getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(float valorCredito) {
        this.valorCredito = valorCredito;
    }

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }
}
