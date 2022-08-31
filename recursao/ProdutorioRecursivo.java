package recursao;

import java.util.List;

public class ProdutorioRecursivo {
	public static void main(String[] args) {
		System.out.println("Produtorio: " + produtorio(List.of(1,2,3,4,45,5,5,5), 1, 0));
	}
	
	public static int produtorio(List<Integer> numeros, Integer controle, int contador) {
		if(contador < numeros.size() - 1) {
			return produtorio(numeros, controle * numeros.get(contador), contador +1);
		} else {
			return controle;
		}
	}
}
