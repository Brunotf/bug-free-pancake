package model;

import java.util.HashSet;
import enumaration.TipoEspecie;

public class Animal {

	private String nome;
	
	private TipoEspecie especie;

	private String dataNasc;

	private int sexo;

	private String peso;
	
	private String porte;

	private HashSet<Consulta> consulta;
	
	private Cliente cpf;
	

	public Animal(String nome, String dataNasc, int sexo, 
			String peso, String porte, HashSet<Consulta> consulta, Cliente cpf) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.peso = peso;
		this.porte = porte;
		this.consulta = consulta;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoEspecie getEspecie() {
		return especie;
	}

	public void setEspecie(TipoEspecie especie) {
		this.especie = especie;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	public String getPorte() {
		return porte;
	}
	
	public void setPorte(String porte) {
		this.porte = porte;
	}

	public HashSet<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(HashSet<Consulta> consulta) {
		this.consulta = consulta;
	}

	public Cliente getCpf() {
		return cpf;
	}
	
	public String calcularIdade() {
		return "Data de nascimento do animal.";
	}

}
