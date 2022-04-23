package model;

public class DiagnosticoMotor {

	public ResultadoDiagnosticoMotor resultadoFinal;
	
	public DiagnosticoMotor() {
		resultadoFinal = ResultadoDiagnosticoMotor.NoDeterminado; 
	}

	public ResultadoDiagnosticoMotor getResultadoFinal() {
		return resultadoFinal;
	}

	public void setResultadoFinal(ResultadoDiagnosticoMotor resultadoFinal) {
		this.resultadoFinal = resultadoFinal;
	}
	
	
}
