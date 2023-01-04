package ModuloUm;

public class operadoresrelacionais {
    public static void main(String[] args) {
        // operador ternario

        double media = 7.1;
        String resultado = media >= 7.0 ? "Aprovado" : media >= 1 ? "aprovado" : "reporvado";
        System.out.printf("O aluno está %s", resultado);

        String s = new String("2");
        System.out.println("2".equals(s));
    }

}
