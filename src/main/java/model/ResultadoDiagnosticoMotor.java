package model;

public enum ResultadoDiagnosticoMotor {
	NoDeterminado,
	TuberiasDeCombustibleSucias,
	TimingDelMotorDesajustado,
	PuntosDeInyeccionDesajustados;
	
	public  Boolean isa(ResultadoDiagnosticoMotor resultado) {
		return this.toString() == resultado.toString();
	}
}
