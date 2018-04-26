package edu.model.conta;

import edu.model.consulta.Exame;

public class ContaExame {
	
	public double calcularExame(Exame e) {
		 return e.getValor() * 1.10;
	}
}
