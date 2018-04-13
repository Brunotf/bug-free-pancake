package edu.model.veterinario;


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
		return (diasTrabalhados * valorHora) + bonus ;
	}
	
	public void horaExtra() {
		System.out.println("Horas guardadas no banco de horas.");
	}
}
