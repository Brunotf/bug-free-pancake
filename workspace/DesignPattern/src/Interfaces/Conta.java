package Interfaces;

public class Conta implements Cobravel, Taxavel {

	@Override
	public double calcularDesconto(double valor) {
		return valor * 0.9;
	}

	@Override
	public double calcularAcrescimo(double valor) {
		return valor * 1.10;
	}

	@Override
	public double gerarFatura(double valor) {
		return valor;
	}

	@Override
	public double aceitarPagamento(double valor) {
		return valor;
	}

	@Override
	public void extornarPagamento() {
		System.out.println("Pagamento extornado");
	}
}
