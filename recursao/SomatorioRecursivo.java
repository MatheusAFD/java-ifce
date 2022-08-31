package recursao;

import java.util.List;

public class SomatorioRecursivo {
	public static void main(String[] args) {
		System.out.println("Somatório: " + somatorio(List.of(1,1,1,1,1), 0, 0));
	}
	
	public static int somatorio(List<Integer> numeros, Integer controle, int contador) {
		if(contador < numeros.size() - 1) {
			return somatorio(numeros, controle + numeros.get(contador), contador +1);
		} else {
			return controle;
		}
	}
}
