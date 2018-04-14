package edu.persistence.historico;

import java.sql.SQLException;
import java.util.LinkedHashSet;

import edu.model.animal.Animal;
import edu.model.consulta.Exame;
import edu.model.consulta.HistoricoExame;

public interface HistoricoExameDAO {
	public void adicionarHistorico(Exame e, Animal a) throws SQLException;
	
	public LinkedHashSet<HistoricoExame> consultarHistoricoExame(String numProntuario) throws SQLException;
	
	public void atualizarHistorico(HistoricoExame he) throws SQLException;
	
}
