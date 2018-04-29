package Composite;

import java.util.LinkedList;

public class Prontuario {
	private LinkedList<Ficha> prontuario;

	public void adicionar(Ficha f) {
		if (prontuario == null) {
			prontuario = new LinkedList<>();
		}
		prontuario.add(f);
	}

	public Ficha obterFilha(int i) {
		return prontuario.get(i - 1);
	}

	public LinkedList<Ficha> obterLista() {
		return prontuario;
	}

}
