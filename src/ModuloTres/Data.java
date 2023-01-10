package ModuloTres;

public class Data {
    int dia;
    int mes;
    int ano;
    String nome;

    Data(int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    Data() {
        dia = 01;
        mes = 01;
        ano = 1970;
    }

    String formata() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
