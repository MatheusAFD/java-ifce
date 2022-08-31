package recursao;

import java.util.List;

public class MenorDaLista {
	public static void main(String[] args) {

		System.out.println("Menor número: " + menor(List.of(2, 3, 42, 23, 4, 231, 3, 4), 0, 1));
	}

	public static int menor(List<Integer> numeros, Integer controle, int contador) {
		if (numeros.get(contador) <= controle && contador < numeros.size() - 1) {
			return menor(numeros, numeros.get(contador), contador + 1);
		}

		if (numeros.get(contador) > controle && contador < numeros.size() - 1) {
			return menor(numeros, controle, contador + 1);
		} else {
			return controle;
		}
	}
}
