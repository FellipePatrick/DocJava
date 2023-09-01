import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Parte 1 do exercicio
        int[] vetorX = {1, 2, 4,5,6};
        int[] vetorY = {2, 3, 5, 6, 8};
        int[] vetorXY = new int[5];
        for (int i = 0; i < 5; i++){
            vetorXY[i] = vetorX[i] + vetorY[i];
            System.out.println(vetorX[i] + " + " + vetorY[i] + " = " + vetorXY[i]);
        }
        //Parte 2 do exercicio
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(5);
        lista.add(6);
        int aux = lista.size() - 1;
        for(int i = 0; i < aux; i++){
            lista.add(lista.get(i) + lista.get(i+1));
            System.out.println(lista.get(i) + " + " + lista.get(i+1) + " = " + (lista.get(i) + lista.get(i+1)));
        }
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}