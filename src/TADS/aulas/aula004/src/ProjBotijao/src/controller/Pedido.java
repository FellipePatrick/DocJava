package controller;
import java.util.Random;
public class Pedido {

    private String endereco;
    private boolean status;
    private int horaCompra;
    private int quantidade;
    private double totalCompras;
    private int horaEntrega;
    private int cartaoCredito;
    private int codigoPedido;

    public String getEndereco() {
        return endereco;
    }

    public Boolean getStatus(){
        return status;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(int horaCompra) {
        this.horaCompra = horaCompra;
        if(horaCompra > 23){
            this.horaEntrega = (horaCompra-24) + 6;
        }else{
            this.horaEntrega = horaCompra + 6;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        this.totalCompras = quantidade * 60;
    }

    public double getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(double totalCompras) {
        this.totalCompras = totalCompras;
    }

    public int getHoraEntrega() {
        return horaEntrega;
    }

    public int getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(int cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
        setCodigoPedido();
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    private void setCodigoPedido() {
        this.codigoPedido++;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public Pedido(String endereco, int horaCompra){
        this.horaCompra = horaCompra;

        this.endereco = endereco;
    }

    public Pedido(){
    }


    public boolean buscaCodigo(int codigo){
        return codigo == this.codigoPedido;
    }

}
