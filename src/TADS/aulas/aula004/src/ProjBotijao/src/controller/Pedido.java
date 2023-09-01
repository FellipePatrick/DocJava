package controller;
import java.util.Random;
public class Pedido {

    Random random = new Random();
    private String endereco;
    private int horaCompra;
    private int quantidade;
    private double totalCompras;
    private int horaEntrega;
    private int cartaoCredito;
    private int codigoPedido;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(int horaCompra) {
        if(horaCompra > 23){
            this.horaCompra = horaCompra - 24;
        }else{
            this.horaCompra = horaCompra;
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

    public void setHoraEntrega(int horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public int getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(int cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private boolean status = false;

    public Pedido(String endereco, int horaCompra){
        this.horaCompra = horaCompra;

        this.endereco = endereco;
    }

    public Pedido(){
    }


    public boolean buscaCodigo(int codigo){
        return codigo == this.codigoPedido;
    }

    private void geraCodigo(){
        this.codigoPedido = random.nextInt(100000);
    }

}
