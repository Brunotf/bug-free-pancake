package Composite;

import java.util.Date;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<Ficha> lista = new LinkedList<>();
		
		Prontuario p = new Prontuario();
		
		Ficha historico1 = new Historico(new Date(), "consulta ", "rotina", "diarreia");
		Ficha historico2 = new Historico(new Date(), "exame", "marcado", "de fezes");
		Ficha historico3 = new Historico(new Date(), "consulta", "retorno", "entregar exames");
		
		p.adicionar(historico1);
		p.adicionar(historico2);
		p.adicionar(historico3);
		
		System.out.println(lista = p.obterLista());
		
		System.out.println(p.obterFilha(2));
		
		p.remover(historico2);
		
		System.out.println(lista = p.obterLista());
		
		for (Ficha f : lista) {
			System.out.println(f.toString());
		}
	}
}
