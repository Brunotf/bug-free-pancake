package edu.persistence.cliente;

import java.util.LinkedHashSet;

import edu.model.cliente.Cliente;

public interface ClienteDAO {

	public void adicionarCliente(Cliente c);
	
	public LinkedHashSet<Cliente> consultarCliente(String txtNome);

	public void atualizarCliente(Cliente c);

	public void inativarCliente(String txtNome);

}
