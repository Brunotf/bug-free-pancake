package edu.persistence.animal;

import java.sql.SQLException;
import java.util.LinkedList;

import edu.model.animal.Animal;

public interface AnimalDAO {
	public void adicionarAnimal(Animal a) throws SQLException;
	
	public LinkedList<Animal> consultarAnimal(String txtnome) throws SQLException;
	
	public void atualizarAnimal(Animal a) throws SQLException;
	
	public void excluirAnimal(Animal a) throws SQLException;

}
