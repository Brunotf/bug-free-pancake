package edu.persistence.cliente;

import java.util.LinkedList;

import edu.model.cliente.Cliente;

public interface ClienteDAO {
	public void adicionarCliente(Cliente c);
	
	public LinkedList<Cliente> consultarCliente(String txtNome);

	public void atualizarCliente(Cliente c);

	public void inativarCliente(String txtNome);

}
