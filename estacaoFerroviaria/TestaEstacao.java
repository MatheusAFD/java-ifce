package estacaoFerroviaria;

public class TestaEstacao {
	public static void main(String[] args) {
		
		Vagao v1 = new Vagao(12578, "Tipo 1", 320, 10, 15);
		Vagao v2 = new Vagao(47898, "Tipo 2", 187, 8, 25);
		Vagao v3 = new Vagao(72699, "Tipo 3", 168, 20, 20);
		
		/* 
		 * N�o consegui encontrar como usar os dados. 
		 * Estacao origem = new Estacao("E159870", "Esta��o E1", "S�o Paulo");
		 * Estacao destino = new Estacao("E154532", "Esta��o E2", "Mato Grosso" );
		 */
		Locomotiva lo = new Locomotiva(1010, "Forte", 38);
		
		Trem t1 = new Trem("T12369", "10/08/2007", v1, v2, v3, lo, "S�o Paulo", "Mato grosso");
		
		Linha l1 = new Linha(1, 580, "Linha manha", t1);
		
		System.out.println("N�mero da linha: " + l1.getNumero());
		System.out.println("Extens�o da linha: " + l1.getExtensaoMetros()+"m");
		System.out.println("Descricao da linha: " + l1.getDescricao());
		System.out.println("Origem: " + l1.getTrem().getOrigem());
		System.out.println("Destino: " + l1.getTrem().getDestino());
		
		System.out.println("-------");
		
		System.out.println("Trem: " + l1.getTrem().getPrefixo());
		System.out.println("Data de forma��o: " + l1.getTrem().getDataDeFormacao());
		System.out.println("Locomotiva: " + l1.getTrem().getLocomotiva().getNumeroDeSerie() + " | Comprimento: " + l1.getTrem().getLocomotiva().getComprimento() + "m");
		
		System.out.println("-------");
		
		System.out.println("Capacidade de carga do vag�o 01: " + v1.getCapacidadeDeCarga());
		System.out.println("Capacidade de carga do vag�o 02: " + v2.getCapacidadeDeCarga());
		System.out.println("Capacidade de carga do vag�o 03: " + v3.getCapacidadeDeCarga());
		System.out.println("-------");
		
	
	}
}
