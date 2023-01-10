package ModuloQuatro.aulas;

import java.util.Arrays;

public class Arrayis {
    public static void main(String[] args) {

        double[] notasaluno = new double[3];

        notasaluno[0] = 3.4;
        notasaluno[1] = 4.4;
        notasaluno[2] = 5.4;

        double total = 0;

        for (int i = 0; i < notasaluno.length; i++) {
            total += notasaluno[i];
            System.out.println(notasaluno[i]);
        }

        System.out.println(total / notasaluno.length);

        System.out.println(Arrays.toString(notasaluno));
    }
}
