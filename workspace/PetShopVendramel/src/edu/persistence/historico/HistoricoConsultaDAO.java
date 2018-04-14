package edu.persistence.historico;

import java.sql.SQLException;
import java.util.LinkedList;

import edu.model.animal.Animal;
import edu.model.consulta.Consulta;
import edu.model.consulta.Exame;
import edu.model.consulta.HistoricoConsulta;

public interface HistoricoConsultaDAO {
	public void adicionarHistorico(Consulta c) throws SQLException;
	
	public LinkedList<HistoricoConsulta> consultarHistorico(String prontuario) throws SQLException;
	
	public void atualizarHistorico(HistoricoConsulta h) throws SQLException;
	
}
