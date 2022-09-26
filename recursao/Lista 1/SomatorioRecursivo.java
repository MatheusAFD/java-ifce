package recursao;

class SomatorioRecursivo {

	static void SomarArray(int arr[], int i, int sum) {
		if (i < 0) {
			System.out.print(sum);
			return;
		}
		sum += (arr[i]);
		SomarArray(arr, i - 1, sum);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2 };
		int n = arr.length;
		int sum = 0;

		SomarArray(arr, n - 1, sum);
	}
}