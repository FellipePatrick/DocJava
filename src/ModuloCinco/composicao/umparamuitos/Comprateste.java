package ModuloCinco.composicao.umparamuitos;

public class Comprateste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "Joao Pedro";
        compra1.itens.add(new Item("Caneta", 10, 5.3));
        compra1.adicionar("Caderno", 5, 30.0);
        compra1.adicionar("bolsas", 3, 200.00);

        System.out.println(compra1.itens.size() + " itens na sua lista");
        System.out.println(compra1.valortotal() + "R$ é o valor total dos itens.");

    }

}
