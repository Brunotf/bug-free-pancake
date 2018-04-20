package Composite;

import java.util.Objects;

public class Veterinario extends Medico {

	public Veterinario(String nome, String crmv, String tel) {
		this.nome = nome;
		this.crmv = crmv;
		this.telefone = tel;
	}

	@Override
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
		Medico medico = (Medico) o;
		// field comparison
		return Objects.equals(nome, medico.nome) && Objects.equals(crmv, medico.crmv);
	}
}
