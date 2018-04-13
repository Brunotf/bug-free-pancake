package edu.model.veterinario;

import java.util.HashSet;

import edu.model.consulta.Consulta;

public class Veterinario {

	protected String crmv;

	protected String nome;

	protected String dataNasc;

	protected String cpf;

	protected String telefone;

	protected String diasDisponiveis;

	protected int diasTrabalhados;

	protected double valorHora;

	protected double salario;

	protected HashSet<Consulta> consulta;

	public String getCrmv() {
		return crmv;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDiasDisponiveis() {
		return diasDisponiveis;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getDiasdTrabalhados() {
		return diasTrabalhados;
	}

	public void setSalario(int diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}

	public void setDiasDisponiveis(String diasDisponiveis) {
		this.diasDisponiveis = diasDisponiveis;
	}

	public HashSet<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(HashSet<Consulta> consulta) {
		this.consulta = consulta;
	}

	public double gerarSalario(double bonus) {
		return (diasTrabalhados * valorHora) + bonus;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Dr. " + getNome() + "\n");
		sb.append("CRMV : " + getCrmv());
		return sb.toString();

	}

}
