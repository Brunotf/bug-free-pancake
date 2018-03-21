package model;

import java.util.HashSet;

import enumaration.TipoPagamento;

public class Conta {

	private double valor;

	private TipoPagamento formaPag;

	@SuppressWarnings("unused")
	private String horarioEmergencia;

	private double valorFinal;
	
	private HashSet<Consulta> consulta;
	
	private HashSet<Exame> exame;
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public TipoPagamento getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(TipoPagamento formaPag) {
		this.formaPag = formaPag;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
	
	public HashSet<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(HashSet<Consulta> consulta) {
		this.consulta = consulta;
	}

	public HashSet<Exame> getExame() {
		return exame;
	}

	public void setExame(HashSet<Exame> exame) {
		this.exame = exame;
	}

	public double acrescimoHorario(double valor) {
		return valor * 1.10;
	}
	
	public double gerarDesconto(double valor) {
		return valor * 0.9;
	}
	
}
