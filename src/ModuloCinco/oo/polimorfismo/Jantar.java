package ModuloCinco.oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(95);
        Arroz refeicao1 = new Arroz(1);
        pessoa.comer(refeicao1);
        System.out.println(pessoa.getPeso());
    }
}
