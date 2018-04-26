package edu.model.conta;

import edu.model.consulta.Consulta;

public class ContaConsulta {
	
	public double calcularConsulta(Consulta c) {
		return c.getValor() * 1.10;
	}
}
