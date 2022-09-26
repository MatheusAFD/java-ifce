package recursao;


public class MaiorDaLista {
	public static void main(String[] args) {

		int arr[] = { 5, 1000, 1, 3, 2, 5, 6, 33, 20 };

		System.out.println("Maior: " + maior(arr, arr.length, 0));

	}

	static int maior(int v[], int tam, int indice) {
		if (tam == 0)
			return v[indice];
		else {
			if (v[tam - 1] > v[indice])
				return maior(v, tam - 1, tam - 1);
			else
				return maior(v, tam - 1, indice);
		}
	}
}
