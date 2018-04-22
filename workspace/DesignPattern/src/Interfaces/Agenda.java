package Interfaces;

public class Agenda implements Agendavel {

	@Override
	public void agendar() {
		System.out.println("Consulta agendada");
	}

	@Override
	public void cancelarAgendamento() {
		System.out.println("Consulta cancelada");
	}

	@Override
	public void consultarDisponibilidade() {
	}

}
