package ordenacao.arvore;

public class ArvoreBinaria {
    int numero;
    ArvoreBinaria noEsquerda = null;
    ArvoreBinaria noDireita = null;

    public ArvoreBinaria(int numero) {
        this.numero = numero;
    }

    public void adicionar(int numero) {
        if(numero > this.numero) {
            if(noDireita == null) {
                noDireita = new ArvoreBinaria(numero);
            } else
                noDireita.adicionar(numero);
        } else {
            if(noEsquerda == null) {
                noEsquerda = new ArvoreBinaria(numero);
            } else
                noEsquerda.adicionar(numero);
        }
    }

    public String imprimir() {
        String resultado = "";
        if(noEsquerda != null)
            resultado += noEsquerda.imprimir();
        resultado += " " + this.numero + " ";
        if(noDireita != null)
            resultado += noDireita.imprimir();

        return resultado;
    }
}
