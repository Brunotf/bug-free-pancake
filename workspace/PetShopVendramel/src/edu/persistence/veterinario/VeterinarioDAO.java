package edu.persistence.veterinario;

import java.sql.SQLException;
import java.util.LinkedList;

import edu.model.veterinario.Veterinario;

public interface VeterinarioDAO {
	public void adicionarVeterinario(Veterinario v) throws SQLException;
	
	public LinkedList<Veterinario> consultaVeterinario(String txtNome) throws SQLException;
	
	public void atualizarVeterinario(Veterinario v) throws SQLException;
	
	public void excluirVeterinario(Veterinario v) throws SQLException;

}
