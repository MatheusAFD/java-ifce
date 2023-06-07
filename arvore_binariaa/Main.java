package arvore_binariaa;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(5);
        arvore.inserir(3);
        arvore.inserir(8);
        arvore.inserir(1);
        arvore.inserir(4);

        System.out.println("Árvore binária:");
        arvore.listar();

        int valorBuscado = 4;
        boolean encontrado = arvore.buscar(valorBuscado);
        if (encontrado) {
            System.out.println("Valor " + valorBuscado + " encontrado na árvore.");
        } else {
            System.out.println("Valor " + valorBuscado + " não encontrado na árvore.");
        }

        int valorRemover = 3;
        arvore.remover(valorRemover);
        System.out.println("Árvore após remover o valor " + valorRemover + ":");
        arvore.listar();

        int valorMinimo = arvore.minimo();
        System.out.println("Valor mínimo da árvore: " + valorMinimo);
        
    }
}