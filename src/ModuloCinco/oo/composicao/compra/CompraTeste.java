package ModuloCinco.oo.composicao.compra;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.adicionarItem("Blusa", 7,8.50);
        System.out.println(compra1.getValorTotal());
    }
}
