package arvore_binariaa;

import java.util.NoSuchElementException;



class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        this.raiz = inserirRecursivamente(this.raiz, valor);
    }

    private No inserirRecursivamente(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = inserirRecursivamente(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRecursivamente(no.direita, valor);
        }

        return no;
    }

    public boolean buscar(int valor) {
        return buscarRecursivamente(raiz, valor);
    }

    private boolean buscarRecursivamente(No no, int valor) {
        if (no == null) {
            return false;
        }

        if (valor == no.valor) {
            return true;
        } else if (valor < no.valor) {
            return buscarRecursivamente(no.esquerda, valor);
        } else {
            return buscarRecursivamente(no.direita, valor);
        }
    }

    public void remover(int valor) {
        this.raiz = removerRecursivamente(raiz, valor);
    }

    private No removerRecursivamente(No no, int valor) {
        if (no == null) {
            return null;
        }

        if (valor < no.valor) {
            no.esquerda = removerRecursivamente(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = removerRecursivamente(no.direita, valor);
        } else {
            if (no.esquerda == null && no.direita == null) {
                return null;
            } else if (no.esquerda == null) {
                return no.direita;
            } else if (no.direita == null) {
                return no.esquerda;
            }

            No sucessor = encontrarMinimo(no.direita);
            no.valor = sucessor.valor;
            no.direita = removerRecursivamente(no.direita, sucessor.valor);
        }

        return no;
    }

    private No encontrarMinimo(No no) {
        while (no.esquerda != null) {
            no = no.esquerda;
        }
        return no;
    }

    public int minimo() {
        if (raiz == null) {
            throw new NoSuchElementException("A árvore está vazia");
        }
        return encontrarMinimo(raiz).valor;
    }

 
    public void listar() {
        listarRecursivamente(raiz, 0);
    }

    private void listarRecursivamente(No no, int nivel) {
        if (no == null) {
            return;
        }

        listarRecursivamente(no.direita, nivel + 1);

        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }
        System.out.println(no.valor);

        listarRecursivamente(no.esquerda, nivel + 1);
    }
}


