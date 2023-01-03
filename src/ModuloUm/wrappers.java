package ModuloUm;

public class wrappers {
    public static void main(String[] args) {
        Byte b = 100;
        Short s = 1000;

        Integer i = 10000;
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());

        Float f = 123.12F;

        Double d = 1234.123;

        Boolean bo = Boolean.parseBoolean(
                "True");
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c + "........");
    }
}
