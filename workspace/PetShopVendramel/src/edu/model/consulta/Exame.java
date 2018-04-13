package edu.model.consulta;

public class Exame {

	private String dataColeta;

	private String dataResultado;

	private String resultado;

	private String tipo;

	public String getDataColeta() {
		return dataColeta;
	}

	public void setDataColeta(String dataColeta) {
		this.dataColeta = dataColeta;
	}

	public String getDataResultado() {
		return dataResultado;
	}

	public void setDataResultado(String dataResultado) {
		this.dataResultado = dataResultado;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void calcularDataResultado() {
		this.dataResultado = dataColeta + " mais uma semana.";
	}

}
