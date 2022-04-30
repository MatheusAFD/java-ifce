package estacaoFerroviaria;

public class Estacao {
	String ponto;
	String sigla;
	String descricao;
	Linha linha;
	
	public Estacao(String sigla, String descricao, String ponto) {
		this.sigla = sigla;
		this.descricao = descricao;
		this.ponto = ponto;
	}
	
	public String getPonto() {
		return ponto;
	}
	public void setPonto(String ponto) {
		this.ponto = ponto;
	}
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
