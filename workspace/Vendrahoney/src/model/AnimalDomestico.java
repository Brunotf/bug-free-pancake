package model;

import java.util.HashSet;

public class AnimalDomestico extends Animal {
	
	private String rga;
	
	public AnimalDomestico(String nome, String dataNasc, int sexo,
			String peso, String porte, HashSet<Consulta> consulta, Cliente cpf) {
		super(nome, dataNasc, sexo, peso, porte, consulta, cpf);
	}

	public String getRga() {
		return rga;
	}

	public void setRga(String rga) {
		this.rga = rga;
	}
	
	
}
