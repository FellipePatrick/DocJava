package ModuloQuatro.aulas;

import java.util.Scanner;

public class Matriiz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("quantos alunos?");
        int alunos = entrada.nextInt();
        System.out.println("quantas notas por aluno?");
        int notasaluno = entrada.nextInt();

        double[][] notasturma = new double[alunos][notasaluno];
        double total = 0;
        for (int a = 0; a < notasturma.length; a++) {
            for (int n = 0; n < notasturma[a].length; n++) {
                System.out.printf("Informe a nota d% do aluno %d:", n + 1, a + 1);
                notasturma[a][n] = entrada.nextDouble();
                total += notasturma[a][n];
            }
        }

        double media = total / (alunos * notasaluno);

        System.out.println("A media da turma é: " + media);

        entrada.close();

    }
}
