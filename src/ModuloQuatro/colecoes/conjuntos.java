package ModuloQuatro.colecoes;

import java.util.HashSet;
import java.util.Set;

public class conjuntos {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet<>();

        conjunto.add(1.2);
        conjunto.add("teste");

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove(1.2));

        Set nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums);

        conjunto.retainAll(nums);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
