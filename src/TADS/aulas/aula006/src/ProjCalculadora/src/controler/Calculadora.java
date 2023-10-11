package controler;

public class Calculadora {
    private float operando1;
    private float operando2;
    private char operador;
    public Calculadora(){
        this.operando1 = 0;
        this.operando2 = 0;
    }

    public void setOperando1(float operando1) {
        this.operando1 = operando1;
    }

    public void setOperando2(float operando2) {
        this.operando2 = operando2;
    }

    public float getOperando1() {
        return operando1;
    }

    public float getOperando2() {
        return operando2;
    }

    public float calcular(char operador){
        switch (operador){
            case '+':
                return soma(this.operando1, this.operando2);
            case '-':
                return subtracao(this.operando1, this.operando2);
            case '/':
                return divisao(this.operando1, this.operando2);
            case '*':
                return multiplicacao(this.operando1, this.operando2);
            default:
                return 0000000001;
        }
    }
    private float soma(float op1, float op2){
        return op1+op2;
    }
    private float subtracao(float op1, float op2){
        return op1-op2;
    }
    private float divisao(float op1, float op2){
        return op1/op2;
    }
    private float multiplicacao(float op1, float op2){
        return op1*op2;
    }


}
