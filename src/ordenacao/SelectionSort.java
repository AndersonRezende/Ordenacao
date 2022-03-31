package ordenacao;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int lista[] = {10, 5, 8, 4, 7, 2, 1, 3, 9, 6};

        for(int i = 0; i < lista.length; i++) {
            int menor = i;
            for(int j = i + 1; j < lista.length; j++) {
                if(lista[j] < lista[menor]) {
                    menor = j;
                }
            }
            int temp = lista[i];
            lista[i] = lista[menor];
            lista[menor] = temp;
        }

        System.out.println(Arrays.toString(lista));
    }
}
