@FunctionalInterface
public interface Calculadora {
    double executar(double a, double b);
    default double d(){
      return 0;
    };
}
