package edu.persistence.animal;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

import edu.model.animal.Animal;

public class AnimalDAOImpl implements AnimalDAO {
	
	private Connection con;

	@Override
	public void adicionarAnimal(Animal a) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LinkedList<Animal> consultarAnimal(String txtnome) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizarAnimal(Animal a) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirAnimal(Animal a) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
