package delegacao;

public class Exame {

	GerarCobranca gc;

	public double GerarCobrança(double valor) {

		gc = new GerarCobranca();

		return gc.getCobranca(valor);
	}
}
