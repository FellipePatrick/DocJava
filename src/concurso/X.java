package concurso;

public class X {

    public int x(int x) {
        if (x == 0)
            return 1;
        return x * x(x - 1);
    }

    public static void main(String[] args) {
        X x = new X();
        System.out.println(x.x(5));
    }
}