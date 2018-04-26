package edu.persistence.historico;

import java.util.LinkedHashSet;

import edu.model.animal.Animal;
import edu.model.consulta.Exame;
import edu.model.consulta.HistoricoExame;

public interface HistoricoExameDAO {
	public void adicionarHistorico(Exame e, Animal a);
	
	public LinkedHashSet<HistoricoExame> consultarHistoricoExame(String numProntuario);
	
	public void atualizarHistorico(HistoricoExame he);
	
}
