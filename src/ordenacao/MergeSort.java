package ordenacao;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int lista[] = {10, 5, 8, 4, 7, 2, 1, 3, 9, 6};

        mergesort(lista, 0, lista.length - 1);

        System.out.println(Arrays.toString(lista));
    }

    public static void mergesort(int lista[], int posicaoInicio, int posicaoFim) {
        if(posicaoInicio == posicaoFim) {
            return;
        }

        int meio = (posicaoInicio + posicaoFim) / 2;

        mergesort(lista, posicaoInicio, meio);
        mergesort(lista, meio + 1, posicaoFim);

        int percorreEsquerda = posicaoInicio;
        int percorreDireita = meio + 1;
        int indiceAuxiliar = 0;
        int auxiliar[] = new int[posicaoFim - posicaoInicio + 1];

        while(percorreEsquerda <= meio || percorreDireita <= posicaoFim) {
            if(percorreEsquerda > meio) {
                auxiliar[indiceAuxiliar] = lista[percorreDireita];
                indiceAuxiliar++;
                percorreDireita++;
            } else if(percorreDireita > posicaoFim) {
                auxiliar[indiceAuxiliar] = lista[percorreEsquerda];
                indiceAuxiliar++;
                percorreEsquerda++;
            } else if(lista[percorreEsquerda] < lista[percorreDireita]) {
                auxiliar[indiceAuxiliar] = lista[percorreEsquerda];
                indiceAuxiliar++;
                percorreEsquerda++;
            } else {
                auxiliar[indiceAuxiliar] = lista[percorreDireita];
                indiceAuxiliar++;
                percorreDireita++;
            }
        }

        for(int i = posicaoInicio; i <= posicaoFim; i++) {
            lista[i] = auxiliar[i - posicaoInicio];
        }
    }
}
