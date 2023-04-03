/*
Recursão é quando uma função ou procedimento chama a si mesmo para resolver um problema. Isso serve para dividir um problema grande em problemas menores e ir resolvendo um por um até chegar numa solução bem simples, que é chamada de caso base.

A recursão é bem útil em várias situações. Por exemplo:

1 - Quando precisamos trabalhar com estruturas de dados que são como uma árvore ou um gráfico, em que cada "nó" pode ter vários "filhos".

2 - Quando temos um problema que precisa ser resolvido várias vezes, mas em dados cada vez menores e independentes.

3 - Quando precisamos resolver problemas matemáticos tipo fatorial, Fibonacci e soma de elementos de um vetor.
*/

public class SequenciaTriangular {
    
    public static void main(String[] args) {
        imprimeNumerosTriangulares(5);
    }
    
    public static int triangular(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + triangular(n - 1);
        }
    }

    public static void imprimeNumerosTriangulares(int quantidadeDeNumeros) {
        for (int i = 1;  i <= quantidadeDeNumeros; i++) {
            System.out.print(triangular(i) + " ");
        }
    }
}