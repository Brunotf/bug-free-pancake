package view;

import controller.ControleCliente;
import model.Cliente;

public class main {
	
	static ControleCliente c;

	public static void main(String[] args) {
		
		String nome = "Jos� da Silva";

		String cpf = "080904564";

		String endereco = "Rua das Ac�cias, 81";

		String telefone = "65852564";
		
		String email = "zezinhogatinhodabalada@uol.com.br";
		
		System.out.println(c);

		
		new ControleCliente();
		
		c.adicionaCliente(new Cliente(nome, cpf, endereco, telefone, email));

	}
}
