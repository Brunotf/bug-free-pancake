package model;

public class Consulta {

	private String dataHora;

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

	public String getTipoAtend() {
		return tipoAtend;
	}

	public void setTipoAtend(String tipoAtend) {
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

	private String procedimento;

	private String sintomas;

	private String tipoAtend;

	private Animal animal;

	private Veterinario veterinario;

	

}
