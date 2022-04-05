package ordenacao;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int lista[] = {10, 5, 8, 4, 7, 2, 1, 3, 9, 6};

        quickSort(lista, 0, lista.length - 1);

        System.out.println(Arrays.toString(lista));
    }

    public static void quickSort(int lista[], int esquerda, int direita) {
        if(esquerda >= direita) {
            return;
        }

        int elemento = esquerda;
        for(int i = esquerda; i < direita; i++) {
            if(lista[i] <= lista[direita]) {
                int auxiliar = lista[elemento];
                lista[elemento] = lista[i];
                lista[i] = auxiliar;
                elemento ++;
            }
        }
        int auxiliar = lista[elemento];
        lista[elemento] = lista[direita];
        lista[direita] = auxiliar;

        int meio = (esquerda + direita) / 2;
        quickSort(lista, esquerda, meio);
        quickSort(lista, meio + 1, direita);
    }
}
