 class ArrayRecursivo {
    
    public static void main(String[] args) {
    int[] lista = {1, 2, 3, 2, 4, 2, 5};
    int elemento = 2;
    System.out.println("O elemento " + elemento + " aparece " + contarOcorrencias(lista, elemento) + " vezes no array.");
}

public static int contarOcorrencias(int[] array, int elemento) {
    return contarOcorrenciasAuxiliar(array, elemento, 0);
}

private static int contarOcorrenciasAuxiliar(int[] array, int elemento, int indice) {
    
    if (indice == array.length) {
        return 0;
    }
    
    if (array[indice] == elemento) {
        return 1 + contarOcorrenciasAuxiliar(array, elemento, indice + 1);
    }

    return contarOcorrenciasAuxiliar(array, elemento, indice + 1);
}

}
