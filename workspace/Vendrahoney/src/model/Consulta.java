package model;

public class Consulta {

	private String dataHora;
	
	private String procedimento;

	private String sintomas;

	private String tipoAtend;
	
	private static String horarioPico;


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

	public static String getHorarioPico() {
		return horarioPico;
	}

	public static void setHorarioPico(String horarioPico) {
		Consulta.horarioPico = horarioPico;
	}
	
	public static String calculaHorarioPico() {
		return horarioPico;
	}

}
