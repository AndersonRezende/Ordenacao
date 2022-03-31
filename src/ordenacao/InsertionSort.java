package ordenacao;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int lista[] = {10, 5, 8, 4, 7, 2, 1, 3, 9, 6};
        int j;

        for(int i = 1; i < lista.length; i++) {
            int itemSelecionado = lista[i];
            j = i - 1;
            while(j >= 0 && itemSelecionado < lista[j]) {
                lista[j + 1] = lista[j];
                j--;
            }
            lista[j + 1] = itemSelecionado;
        }

        System.out.println(Arrays.toString(lista));
    }
}
