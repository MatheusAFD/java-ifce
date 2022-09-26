package recursao;

public class FatorialRecursivo {
	public static void main(String[] args) {

		FatorialRecursivo r = new FatorialRecursivo();
		int resp = r.fatorial(5);
		System.out.println(resp);

	}

	public int fatorial(int x) {
		//
		if (x == 0) return 1;
		return x * fatorial(x - 1);
	}
}
