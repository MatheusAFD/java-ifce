package recursao;

import java.util.List;

public class MaiorDaLista {
	public static void main(String[] args) {
		
		System.out.println("Maior número: " + maior(List.of(1,2,3,4,5,6,7,8), 0,1));
	}
	
	public static int maior(List<Integer> numeros, Integer controle, int contador) {
		if(numeros.get(contador) > controle && contador < numeros.size() -1) {
			return maior(numeros, numeros.get(contador), contador + 1);
		}
		
		if(numeros.get(contador) <= controle && contador < numeros.size() -1) {
			return maior(numeros, controle, contador + 1);
		} else {
			return numeros.get(contador);
		}
	}
}
