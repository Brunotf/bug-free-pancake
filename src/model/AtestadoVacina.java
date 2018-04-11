package model;

public class AtestadoVacina {
	
	private String dataRaiva;
	
	public String getDataRaiva() {
		return dataRaiva;
	}
	
	public void setDataRaiva(String dataVacina) {
		this.dataRaiva = dataVacina;
	}
	
	public void verificaValidade(String dataVacina) {
		System.out.println("Vacina verificada...");
	}

}
