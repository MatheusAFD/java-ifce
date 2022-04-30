package estacaoFerroviaria;

public class Linha {
	private int numero;
	private double extensaoMetros;
	private String descricao;
	Trem trem;
	
	public Linha(int numero, double extensaoMetros, String descricao, Trem trem) {
		this.numero = numero;
		this.extensaoMetros = extensaoMetros;
		this.descricao = descricao;
		this.trem = trem;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getExtensaoMetros() {
		return extensaoMetros;
	}

	public void setExtensaoMetros(double extensaoMetros) {
		this.extensaoMetros = extensaoMetros;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Trem getTrem() {
		return trem;
	}


	public void setTrem(Trem trem) {
		this.trem = trem;
	}
}
