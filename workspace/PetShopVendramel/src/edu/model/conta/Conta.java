package edu.model.conta;

import java.util.LinkedList;

import edu.enumeradas.TipoPagamento;
import edu.model.consulta.Consulta;
import edu.model.consulta.Exame;

public class Conta {
	private double valorFinal;
	
	private TipoPagamento formaPagamento;
	
	public double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	public TipoPagamento getFormaPag() {
		return formaPagamento;
	}

	public void setFormaPag(TipoPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public void cobrarConsulta(Consulta c) {
		ContaConsulta cc = new ContaConsulta();
		valorFinal = cc.calcularConsulta(c);
	}
	
	public void cobrarExame(LinkedList<Exame> exame) {
		ContaExame ce = new ContaExame();
		for (Exame e : exame) {
			valorFinal += ce.calcularExame(e);
		}
	}
}
