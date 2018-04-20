package Composite;

import java.util.Objects;

public class Medico {
	protected String nome;

	protected String crmv;

	protected String telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrmv() {
		return crmv;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(nome + " : ");
		sb.append(crmv);

		return sb.toString();
	}

}
