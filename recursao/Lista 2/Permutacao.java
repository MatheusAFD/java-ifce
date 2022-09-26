package recursao;

public class Permutacao {

	private static void trocar(char[] chars, int i, int j) {

		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
	}

	private static void permutacoes(char[] chars, int contador) {
		if (contador == chars.length - 1) {
			System.out.println(String.valueOf(chars));
		}

		for (int i = contador; i < chars.length; i++) {
			trocar(chars, contador, i);
			permutacoes(chars, contador + 1);
			trocar(chars, contador, i);
		}
	}

	public static void permutacao(String str) {

		if (str == null || str.length() == 0) {
			return;
		}

		permutacoes(str.toCharArray(), 0);
	}

	public static void main(String[] args) {
		String str = "ABCDE";
		permutacao(str);
	}
}
