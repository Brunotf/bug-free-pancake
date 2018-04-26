package edu.persistence.historico;

import java.util.LinkedList;

import edu.model.consulta.Consulta;
import edu.model.consulta.HistoricoConsulta;

public interface HistoricoConsultaDAO {
	public void adicionarHistorico(Consulta c);
	
	public LinkedList<HistoricoConsulta> consultarHistorico(String prontuario);
	
	public void atualizarHistorico(HistoricoConsulta h);
	
}
