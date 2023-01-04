package ModuloUm;

public class operadores {
    public static void main(String[] args) {

        // Operadores Aritmeticos

        int a = 4 * 3 - 10;

        a = (int) Math.pow(a, 3);

        int form1 = (6 * (3 + 2));

        form1 = (int) Math.pow(form1, 2);

        form1 = form1 / (3 * 2);

        int form2 = ((1 - 5) * (2 - 7)) / 2;

        form2 = (int) Math.pow(form2, 2);

        int somaf = form1 - form2;

        somaf = (int) Math.pow(somaf, 3);

        int base = 10;

        base = (int) Math.pow(base, 3);

        somaf = somaf / base;

        // System.out.println(somaf);

        // Operadores Logicos

        // && = E

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comproutv = trabalho1 && trabalho2;

        System.out.printf("Comprou a tv? %s", comproutv);

        // || = ou
        trabalho1 = true;
        trabalho2 = false;

        comproutv = trabalho1 || trabalho2;

        System.out.printf("%n%nComprou a tv? %s", comproutv);

        // ^ = ou exclusivo
        trabalho1 = true;
        trabalho2 = false;

        comproutv = trabalho1 ^ !trabalho2;

        System.out.printf("%n%nComprou a tv? %s", comproutv);

        // ! = negacao logica
        trabalho1 = true;
        trabalho2 = false;

        comproutv = trabalho1 && trabalho2;

        System.out.printf("%n%nComprou a tv? %s", comproutv);

    }
}
