package recursao;

import java.util.Arrays;

public class Inverter {
	public static void main(String[] args) {
		int[] A = {4,342,43,3,2};
		inverter(A, 0, A.length - 1);
		System.out.println(Arrays.toString(A));
	}
	
	private static void inverter (int[] A, int i, int j) {
		if (i < j) {
			trocar (A, i, j);
			inverter(A, i + 1, j - 1);
		}
	}
	
	private static void trocar(int[] A, int i, int j) {
		int aux = A[i];
		A[i] = A[j];
		A[j] = aux;
	}
}
