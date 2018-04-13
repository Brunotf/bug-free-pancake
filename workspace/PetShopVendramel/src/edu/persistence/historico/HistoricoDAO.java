package edu.persistence.historico;

import java.sql.SQLException;
import java.util.LinkedList;

import edu.model.animal.Animal;
import edu.model.consulta.Consulta;
import edu.model.consulta.Exame;
import edu.model.consulta.Historico;

public interface HistoricoDAO {
	public void adicionarHistorico(Consulta c, Exame e) throws SQLException;
	
	public LinkedList<Historico> consultarHistorico(Animal a) throws SQLException;
	
	public void atualizarHistorico(Historico h) throws SQLException;
	
	public void excluirHistorico(Animal a) throws SQLException;

}
