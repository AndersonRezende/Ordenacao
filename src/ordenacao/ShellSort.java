package ordenacao;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int lista[] = {10, 5, 8, 4, 7, 2, 1, 3, 9, 6};

        shellSort(lista);

        System.out.println(Arrays.toString(lista));
    }

    public static void shellSort(int lista[]) {
        int gap = lista.length / 2;
        while(gap > 0) {
            for(int i = gap; i < lista.length ; i++) {
                int itemSelecionado = lista[i];
                int j = i - gap;
                while(j >= 0 && itemSelecionado < lista[j]) {
                    lista[j + gap] = lista[j];
                    lista[i - gap] = itemSelecionado;
                    j -= gap;
                }
            }
            gap = gap / 2;
        }
    }
}
