package ModuloCinco.composicao.desafio1;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria");

        Compra c1 = new Compra();
        c1.adicionarItem("Caneta", 10.50, 12);

        Compra c2 = new Compra();
        c2.adicionarItem("Caneta1", 10.50, 122);

        cliente.adicionarCompra(c1);

        cliente.compras.add(c2);

        System.out.println(cliente.obterValorTotal());
    }
}
