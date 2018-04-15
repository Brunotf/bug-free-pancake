import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));

		LinkedList<Medico> lista = new LinkedList<>();
        
		Especialista medicoChefe = new Especialista("Paulo", "1", "12345678", "Chato pa krl");;
		
		medicoChefe.adicionar(medicoChefe);
		
		Especialista veterinarioChefe = new Especialista("Ana", "2", "231415123", "super alegre");
		
		medicoChefe.adicionar(veterinarioChefe);
		
		int op = 0;

		do {			
			System.out.println("1 - novo especialista. 2 - novo veterinario. 3 - buscar medico. 6 - buscar todos. 9 - sair");
			op = Integer.parseInt(ler.readLine());
			
			if (op == 1) {
				System.out.println("Digite nome / crmv / tel / especialidade");
				Medico m = new Especialista(ler.readLine(), ler.readLine(), ler.readLine(), ler.readLine());
				veterinarioChefe.adicionar(m);
			} else if (op == 2) {
				System.out.println("Digite nome / crmv / tel");
				Medico m = new Veterinario(ler.readLine(), ler.readLine(), ler.readLine());
				veterinarioChefe.adicionar(m);
			} else if (op == 3) {
				System.out.println("Digite um valor");				
				System.out.println(medicoChefe.obterFilha(Integer.parseInt(ler.readLine())));
				
			} else if (op == 6) {
				lista = medicoChefe.obterLista();
				for (Medico medico : lista) {
					System.out.println(medico.toString());
				}
			} else if (op == 9) {
				System.exit(0);
			}
		} while (op != 999);
		
	}
}
