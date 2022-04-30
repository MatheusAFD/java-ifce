package estacaoFerroviaria;

public class Locomotiva {
	private int numeroDeSerie;
	private String capacidadeDeTracao;
	private double comprimento;
	
	public Locomotiva(int numeroDeSerie, String capacidadeDeTracao, double comprimento) {
		this.numeroDeSerie = numeroDeSerie;
		this.capacidadeDeTracao = capacidadeDeTracao;
		this.comprimento = comprimento;
	}
	
	public Locomotiva() {
		
	}
	
	public int getNumeroDeSerie() {
		return numeroDeSerie;
	}
	public void setNumeroDeSerie(int numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	public String getCapacidadeDeTracao() {
		return capacidadeDeTracao;
	}
	public void setCapacidadeDeTracao(String capacidadeDeTracao) {
		this.capacidadeDeTracao = capacidadeDeTracao;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	
	
}
