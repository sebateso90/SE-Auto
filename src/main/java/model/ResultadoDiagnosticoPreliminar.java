package model;

public enum ResultadoDiagnosticoPreliminar {

	NoDeterminado,
	FaltaCombustible,
	BateriaBaja;
	
	public Boolean isa(ResultadoDiagnosticoPreliminar resultado) {
		return this.toString() == resultado.toString();
	}
}
