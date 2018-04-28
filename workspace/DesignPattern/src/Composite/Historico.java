package Composite;

import java.util.Date;
import java.util.Objects;

public class Historico extends Ficha {
	private String procedimento;
	private String diagnostico;
	
	public Historico(Date dataHora, String tipo, String procedimento, 
					 String diagnostico) {
		this.dataHora = dataHora;
		this.tipo = tipo;
		this.procedimento = procedimento;
		this.diagnostico = diagnostico;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	@Override
	public boolean equals(Object o) {
		// Auto comparação
		if (this == o) {
			return true;
		}

		// Comparando null
		if (o == null) {
			return false;
		}

		// Comparando tipo e cast
		if (getClass() != o.getClass()) {
			return false;
		}

		// Comparando campos
		Ficha f = (Ficha) o;
		return Objects.equals(dataHora, f.dataHora) && Objects.equals(tipo, f.tipo);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append(dataHora.toString() + '\n');
		sb.append(tipo + '\n');
		sb.append(procedimento + '\n');
		sb.append(diagnostico + "\n\n");
		
		return sb.toString();
	}

}
