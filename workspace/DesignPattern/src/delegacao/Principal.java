package delegacao;

public class Principal {
	public static void main(String[] args) {
		
		Consulta c1 = new Consulta();
		
		Consulta c2 = new Consulta();
		
		Exame e = new Exame();
		
		System.out.println("Valor consulta 1 " + c1.GerarCobran�a(2000));
		
		System.out.println("Valor consulta 2 " + c2.GerarCobran�a(5000));
		
		System.out.println("Valor exame " + e.GerarCobran�a(300));
		
	}

}
