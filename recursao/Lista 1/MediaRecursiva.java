package recursao;

class MediaRecursiva {

	static double calculaMedia(int a[], int i, int n) {

		if (i == n - 1)
			return a[i];
		if (i == 0)
			return ((a[i] + calculaMedia(a, i + 1, n)) / n);
		return (a[i] + calculaMedia(a, i + 1, n));
	}

	static double media(int a[], int n) {
		return calculaMedia(a, 0, n);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;

		System.out.println(media(arr, n));
	}
}