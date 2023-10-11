package controler;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    public Data(int dia, int mes, int ano){
        if((dia > 0 && dia < 31) && (mes > 0 && mes < 13)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            this.dia = 01;
            this.mes = 01;
            this.ano = 0001;
        }
    }
    public int compara(Data data){
        if(data == this){
            return 0;
        } else if ((data.ano*365 + data.mes*30 +data.dia) < (this.ano*365 + this.mes*30 +this.dia)){
            return 1;
        }else{
            return -1;
        }
    }
    public int getDia(){
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }

    public String getMesExtenso(){
        switch (this.mes){
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Mês Invalido";
        }
    }
    public Data clone(){
        return this;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
