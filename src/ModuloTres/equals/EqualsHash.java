package ModuloTres.equals;

public class EqualsHash {
    public static void main(String[] args) {
        usuario u1 = new usuario();
        u1.email = "aslkdmmalskm@gmail.com";
        u1.nome = "Fellipe Patrick";

        usuario u2 = new usuario();
        u2.email = "aslkdmmalskm@gmail.com";
        u2.nome = "Fellipe Patrick";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

    }
}
