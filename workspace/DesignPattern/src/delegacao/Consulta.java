package delegacao;

public class Consulta {
	static GerarCobranca gc;

	public Consulta() {
		gc = new GerarCobranca();
		
	}

	public double GerarCobran�a(double valor) {

		return gc.getCobranca(valor);
	}
}
