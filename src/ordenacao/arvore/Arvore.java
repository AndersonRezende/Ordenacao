package ordenacao.arvore;

import java.util.Arrays;

public class Arvore {

    public static void main(String[] args) {
        int lista[] = {10, 5, 8, 4, 7, 2, 1, 3, 9, 6};

        ArvoreBinaria arvoreBinaria = new ArvoreBinaria(lista[0]);
        for(int i = 1; i < lista.length; i++) {
            arvoreBinaria.adicionar(lista[i]);
        }

        System.out.println(arvoreBinaria.imprimir());
    }
}
