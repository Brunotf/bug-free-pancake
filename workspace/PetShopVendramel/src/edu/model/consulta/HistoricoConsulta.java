package edu.model.consulta;

import java.util.HashSet;
import java.util.LinkedList;

public class HistoricoConsulta {
	private int numProntuario;

	private String dataHora;

	private String diagnostico;

	private String descricaoConsulta;

	private String observacoes;

	private LinkedList<Consulta> consulta;

	private LinkedList<Exame> exame;

	public int getNumProntuario() {
		return numProntuario;
	}

	public void setNumProntuario(int numProntuario) {
		this.numProntuario = numProntuario;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getDescricaoConsulta() {
		return descricaoConsulta;
	}

	public void setDescricaoConsulta(String descricaoConsulta) {
		this.descricaoConsulta = descricaoConsulta;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public LinkedList<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(LinkedList<Consulta> consulta) {
		this.consulta = consulta;
	}

	public LinkedList<Exame> getExame() {
		return exame;
	}

	public void setExame(LinkedList<Exame> exame) {
		this.exame = exame;
	}

	public void gerarPdf() {
		System.out.println("PDF do histórico gerado na pasta especificada.");
	}

}
