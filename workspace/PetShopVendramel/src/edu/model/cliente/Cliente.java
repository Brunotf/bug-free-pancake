package edu.model.cliente;

import java.util.HashSet;

import edu.model.animal.Animal;
import edu.model.conta.Conta;

public class Cliente {
	
	private String nome;

	private String cpf;

	private String endereco;

	private String telefone;
	
	private String email;
	
	private static int quantidadeClientes;
	
	private static int mediaAnimal;

	private HashSet<Animal> listaAnimal;
	
	private HashSet<Conta> conta;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static int getQuantidadeClientes() {
		return quantidadeClientes;
	}
	
	public static int getMediaAnimal() {
		return mediaAnimal;
	}
 
	public HashSet<Animal> getAnimal() {
		return listaAnimal;
	}

	public void setAnimal(HashSet<Animal> animal) {
		this.listaAnimal = animal;
	}
	
	public HashSet<Conta> getConta() {
		return conta;
	}

	public void setConta(HashSet<Conta> conta) {
		this.conta = conta;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(getNome() + "\n");
		sb.append("CPF : " + getCpf());
		return sb.toString();
	}

}
