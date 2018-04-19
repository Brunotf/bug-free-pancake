package Composite;
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
	public String toString() {
		StringBuffer sb = new StringBuffer();
		 sb.append(nome + " : ");
		 sb.append(crmv);
		 
		 return sb.toString();
	}

}
