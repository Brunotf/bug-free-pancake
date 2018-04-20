package edu.model.veterinario;

import java.util.Objects;

import edu.enumeradas.TipoEspecialidade;

public class Especialista extends Veterinario {

	private TipoEspecialidade especialidade;

	@SuppressWarnings("unused")
	private String sociedadeEspecialista;

	public TipoEspecialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(TipoEspecialidade especialidade) {
		this.especialidade = especialidade;
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
