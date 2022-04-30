package estacaoFerroviaria;

public class Trem {
	private String prefixo;
	private String dataDeFormacao;
	private String origem;
	private String destino;
	private Vagao vagao;
	private Locomotiva locomotiva;
	
	public Trem(String prefixo, String dataDeFormacao, Vagao vagao00, Vagao vagao01, Vagao vagao02, Locomotiva locomotiva, String origem, String destino) {
		this.prefixo = prefixo;
		this.dataDeFormacao = dataDeFormacao;
		this.vagao = vagao00;
		this.vagao = vagao01;
		this.vagao = vagao02;
		this.locomotiva = locomotiva;
		this.origem = origem;
		this.destino = destino;
	}
	public String getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	public String getDataDeFormacao() {
		return dataDeFormacao;
	}
	public void setDataDeFormacao(String dataDeFormacao) {
		this.dataDeFormacao = dataDeFormacao;
	}
	public Vagao getVagao() {
		return vagao;
	}
	public void setVagao(Vagao vagao) {
		this.vagao = vagao;
	}
	public Locomotiva getLocomotiva() {
		return locomotiva;
	}
	public void setLocomotiva(Locomotiva locomotiva) {
		this.locomotiva = locomotiva;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	
}
