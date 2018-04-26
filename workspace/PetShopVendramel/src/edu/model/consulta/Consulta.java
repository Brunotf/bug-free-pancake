package edu.model.consulta;

import edu.enumeradas.TipoAtendimento;
import edu.model.animal.Animal;
import edu.model.veterinario.Veterinario;

public class Consulta {
	private double valor;
	
	private String dataHora;

	private String procedimento;

	private String sintomas;

	private TipoAtendimento tipoAtend;

	private Animal animal;

	private Veterinario veterinario;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public TipoAtendimento getTipoAtend() {
		return tipoAtend;
	}

	public void setTipoAtend(TipoAtendimento tipoAtend) {
		this.tipoAtend = tipoAtend;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

}
