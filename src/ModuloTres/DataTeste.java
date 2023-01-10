package ModuloTres;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.nome = "Aniversario Fellipe";

        Data d2 = new Data();
        d2.ano = 2004;
        d2.dia = 16;
        d2.mes = 03;
        d2.nome = "Aniversario Jucy";

        Data d3 = new Data(01, 01, 2003);
        d3.nome = "Data exemplo";

        System.out.println(d3.formata() + " essa data é " + d3.nome);
    }
}
