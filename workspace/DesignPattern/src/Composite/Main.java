package Composite;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<Medico> lista = new LinkedList<>();

		Especialista medicoChefe = new Especialista("Wilson", "1", "12345678", "Super especialista");

		medicoChefe.adicionar(medicoChefe);

		Especialista veterinarioChefe = new Especialista("Cristina", "2", "231415123", "Super veterinaria");

		Especialista enfermeiroChefe = new Especialista("Ricardo", "3", "1234123", "super Enfermeira");

		medicoChefe.adicionar(veterinarioChefe);

		Medico v1 = new Veterinario("Neide Maria", "34123451", "548756-5497");
		Medico v2 = new Veterinario("Kosmolino", "1203948", "5252-58746");
		Medico v3 = new Veterinario("Junior Jr", "123412", "2365-9875");

		veterinarioChefe.adicionar(v1);
		veterinarioChefe.adicionar(v2);
		veterinarioChefe.adicionar(v3);

		veterinarioChefe.adicionar(enfermeiroChefe);

		Medico e1 = new Veterinario("Lisa", "123414", "04928-3054");
		Medico e2 = new Veterinario("Alexis", "1234123", "412535");

		enfermeiroChefe.adicionar(e1);
		enfermeiroChefe.adicionar(e2);

		lista = medicoChefe.obterLista();
		for (Medico m : lista) {
			System.out.println(m.toString());
		}

	}
}
