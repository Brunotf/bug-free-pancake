package delegacao;

public class Exame {

	GerarCobranca gc;

	public double GerarCobran�a(double valor) {

		gc = new GerarCobranca();

		return gc.getCobranca(valor);
	}
}
