public class Main {
    public static void main(String[] args) {
        //Lambdas
        Calculadora cal = (x, y) -> {
            return x + y;
        };
        System.out.println(cal.executar(5,6));
    }
}
