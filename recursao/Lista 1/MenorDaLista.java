package recursao;

public class MenorDaLista {
	public static void main(String[] args) {
		
		int arr[] = { 5, 1000, 1, 3, 2, 5, 6, 33, 20, -5 };
		System.out.println("Menor: " + menor(arr, arr.length, 0));
	}
	
	static int menor(int v[], int tam, int indice) {
		if (tam == 0)
			return v[indice];
		else {
			if (v[tam - 1] < v[indice])
				return menor(v, tam - 1, tam - 1);
			else
				return menor(v, tam - 1, indice);
		}
	}
}
