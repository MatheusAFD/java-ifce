package recursao;

public class Polindromo {

	public static boolean isPal(String s) {
		if (s.length() == 0 || s.length() == 1)

			return true;
		if (s.charAt(0) == s.charAt(s.length() - 1))
			return isPal(s.substring(1, s.length() - 1));

		return false;
	}

	public static void main(String[] args) {
		String x = "aia";

		if (isPal(x))
			System.out.println(x + " é polindromo");
		else
			System.out.println(x + " não é polindromo");
	}
}
