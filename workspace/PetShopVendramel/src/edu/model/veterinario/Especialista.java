package edu.model.veterinario;

import java.util.Objects;

import edu.enumeradas.TipoEspecialidade;

public class Especialista extends Veterinario {
	private TipoEspecialidade especialidade;

	private String sociedadeEspecialista;

	public TipoEspecialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(TipoEspecialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	public String getSociedadeEspecialista() {
		return sociedadeEspecialista;
	}

	public void setSociedadeEspecialista(String sociedadeEspecialista) {
		this.sociedadeEspecialista = sociedadeEspecialista;
	}

	@Override
	public double gerarSalario(double bonus) {
		return (diasTrabalhados * valorHora) + bonus;
	}

	public void horaExtra() {
		System.out.println("Horas guardadas no banco de horas.");
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Dr. " + getNome() + "\n");
		sb.append("CRMV: " + getCrmv());
		sb.append("Especialidade: " + getEspecialidade());
		return sb.toString();
	}

	public boolean equals(Object o) {
		// self check
		if (this == o)
			return true;
		// null check
		if (o == null)
			return false;
		// type check and cast
		if (getClass() != o.getClass())
			return false;
		Veterinario veterinario = (Veterinario) o;
		// field comparison
		return Objects.equals(nome, veterinario.nome) && Objects.equals(crmv, veterinario.crmv);
	}
}
