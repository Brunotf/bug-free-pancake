package edu.model.animal;

import java.util.HashSet;

import edu.enumeradas.TipoEspecie;
import edu.model.cliente.Cliente;
import edu.model.consulta.Consulta;

public class Animal implements Comparable<Animal>{

	protected String nome;
	
	protected TipoEspecie especie;

	protected String dataNasc;

	protected int sexo;

	protected String peso;
	
	protected int idade;

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
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int porte) {
		this.idade = porte;
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
	
	public void calcularIdade() {
		this.idade = 0;
	}

	@Override
	public int compareTo(Animal o) {
		String a = o.nome;
		String b = getNome();
		
		return a.compareToIgnoreCase(b);
	}

}
