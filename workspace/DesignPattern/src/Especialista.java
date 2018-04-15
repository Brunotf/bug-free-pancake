import java.util.LinkedList;

public class Especialista extends Medico {
	protected static LinkedList<Medico> equipe;

	private String especialidade;

	public Especialista(String nome, String crmv, String tel, String especialidade) {
		this.nome = nome;
		this.crmv = crmv;
		this.telefone = tel;
		this.especialidade = especialidade;
	}

	public void adicionar(Medico m) {
		if (equipe == null) {
			equipe = new LinkedList<>();
		}
		equipe.add(m);
	}

	public Medico obterFilha(int i) {
		return equipe.get(i);
	}

	public LinkedList<Medico> obterLista() {
		return equipe;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		 sb.append(nome + " - ");
		 sb.append(crmv + " : ");
		 sb.append(especialidade);		 
		 return sb.toString();
	}
}
