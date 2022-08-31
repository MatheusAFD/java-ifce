package recursao;

import java.util.List;

public class MediaRecursiva {
	public static void main(String[] args) {
		System.out.println("Media: " + media(List.of(1,2,3,4,45,5,5,5), 1, 0));
	}
	
	public static int media(List<Integer> numeros, Integer controle, int contador) {
		if(contador < numeros.size()) {
			return media(numeros, controle + numeros.get(contador), contador +1);
		} else {
			return controle / (numeros.size() - 1);
		}
	}
}
