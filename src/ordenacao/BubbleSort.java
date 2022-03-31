package ordenacao;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int lista[] = {10, 5, 8, 4, 7, 2, 1, 3, 9, 6};
        boolean alterado;

        do {
            alterado = false;
            for(int indice = 0; indice < lista.length - 1; indice++) {
                if(lista[indice] > lista[indice+1]) {
                    alterado = true;
                    int temp = lista[indice];
                    lista[indice] = lista[indice+1];
                    lista[indice+1] = temp;
                }
            }
        } while (alterado);

        System.out.println(Arrays.toString(lista));
    }
}
