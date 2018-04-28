package Composite;

import java.util.LinkedList;

public class Prontuario {
	private LinkedList<Ficha> lista;

	public void adicionar(Ficha f) {
		if (lista == null) {
			lista = new LinkedList<>();
		}
		lista.add(f);
	}

	public void remover(Ficha f) {
		lista.remove(f);
	}

	public Ficha obterFilha(int i) {
		return lista.get(i);
	}

	public LinkedList<Ficha> obterLista() {
		return lista;
	}

}
