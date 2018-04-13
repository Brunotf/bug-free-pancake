package edu.model.animal;

import java.util.HashSet;

import edu.enumeradas.TipoEspecie;
import edu.model.cliente.Cliente;
import edu.model.consulta.Consulta;

public class Animal {

	protected String nome;
	
	protected TipoEspecie especie;

	protected String dataNasc;

	protected int sexo;

	protected String peso;
	
	protected String porte;

	protected HashSet<Consulta> consulta;
	
	protected Cliente cpf;
	
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
