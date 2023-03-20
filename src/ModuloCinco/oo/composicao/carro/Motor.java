package ModuloCinco.oo.composicao.carro;

public class Motor {

    Carro carro;

    Motor(Carro carro){
        this.carro = carro;
    }
    double fatorInjecao = 1;
    boolean ligado = false;

    String msg = "rpm";
    int giros(){
        if(!ligado){
            return 0;
        }else {
            int rpm  = (int) Math.round(fatorInjecao*3000);
            System.out.printf("O carro está em %d rpm", rpm);
            return rpm;
        }
    }
}
