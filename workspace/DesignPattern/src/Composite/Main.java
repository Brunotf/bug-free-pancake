package Composite;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Prontuario p = new Prontuario();
		
		Ficha historico1 = new Historico(new Date(), "consulta ", "rotina", "diarreia");
		Ficha historico2 = new Historico(new Date(), "exame", "marcado", "de fezes");
		Ficha historico3 = new Historico(new Date(), "consulta", "retorno", "entregar exames");
		
		p.adicionar(historico1);
		p.adicionar(historico2);
		p.adicionar(historico3);
		
		System.out.println(p.obterLista());
		
		System.out.println(p.obterFilha(2));
	}
}
