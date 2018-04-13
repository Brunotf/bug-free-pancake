package edu.persistence.cliente;

import java.sql.SQLException;
import java.util.LinkedList;

import edu.model.cliente.Cliente;

public interface ClienteDAO {

	public void adicionarCliente(Cliente c) throws SQLException;
	
	public LinkedList<Cliente> consultarCliente(String txtNome) throws SQLException;

	public void atualizarCliente(Cliente c) throws SQLException;

	public void inativarCliente(String txtNome) throws SQLException;

}
