package model;

import java.util.HashSet;

import enumaration.DiaSemana;

public class Veterinario {

	private String crmv;

	private String nome;

	private String dataNasc;

	private String cpf;

	private String telefone;

	private DiaSemana diasDisponiveis;
	
	protected int diasTrabalhados;
	
	protected double valorHora;
	
	private double salario;
	
	private HashSet<Consulta> consulta;

	public Veterinario(String crmv, String nome, String dataNasc, String cpf, String telefone, DiaSemana diasDisponiveis,
			int diasTrabalhados, double valorHora, double salario) {
		this.crmv = crmv;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
		this.telefone = telefone;
		this.diasDisponiveis = diasDisponiveis;
		this.diasTrabalhados = diasTrabalhados;
		this.valorHora = valorHora;
		this.salario = salario;
	}

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
	
	public DiaSemana getDiasDisponiveis() {
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

	public void setDiasDisponiveis(DiaSemana diasDisponiveis) {
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

}
