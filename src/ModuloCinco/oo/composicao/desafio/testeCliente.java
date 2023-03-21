package ModuloCinco.oo.composicao.desafio;

public class testeCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Fellipe");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.45,10);
        compra1.adicionarItem(new Produto("Notebook", 2400), 5);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Escova", 19.45,10);
        compra2.adicionarItem(new Produto("Lapis", 400), 5);

        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println(cliente.getValorTotal());
    }
}
