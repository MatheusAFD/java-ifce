package estacaoFerroviaria;

public class Vagao {
	private int numeroDeSerie;
	private String tipo;
	private double capacidadeDeCarga;
	private double comprimentoEsteira;
	private double comprimentoEngate;
	
	
	
	public Vagao(int numeroDeSerie, String tipo, double capacidadeDeCarga, double comprimentoEsteira,
			double comprimentoEngate) {
		this.numeroDeSerie = numeroDeSerie;
		this.tipo = tipo;
		this.capacidadeDeCarga = capacidadeDeCarga;
		this.comprimentoEsteira = comprimentoEsteira;
		this.comprimentoEngate = comprimentoEngate;
	}
	
	public Vagao() {
		
	}
	public int getNumeroDeSerie() {
		return numeroDeSerie;
	}
	public void setNumeroDeSerie(int numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}
	public void setCapacidadeDeCarga(double capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
	public double getComprimentoEsteira() {
		return comprimentoEsteira;
	}
	public void setComprimentoEsteira(double comprimentoEsteira) {
		this.comprimentoEsteira = comprimentoEsteira;
	}
	public double getComprimentoEngate() {
		return comprimentoEngate;
	}
	public void setComprimentoEngate(double comprimentoEngate) {
		this.comprimentoEngate = comprimentoEngate;
	}
	
	
	
	
}
