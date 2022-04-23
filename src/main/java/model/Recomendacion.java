package model;

public class Recomendacion {
	
	public DiagnosticoPreliminar diagnosticoPreliminar;
	public DiagnosticoMotor diagnosticoMotor;
	AccionRecomendada accion;
	
	public Recomendacion() {
		//Inicializamos los diagnosticos y la accion con el valor por default No Determinado.
		diagnosticoPreliminar = new DiagnosticoPreliminar();
		diagnosticoMotor = new DiagnosticoMotor();
		accion = AccionRecomendada.NoEncontrada;
		// En la etapa final del razonamiento se volcara la recomendacion final en accion.
	} 
	
	
	@Override
	public String toString() {
		return "Diagnosticos[diagnosticoPreliminar=" + diagnosticoPreliminar + ", diagnosticoMotor=" + diagnosticoMotor
				+ "]\n[Recomendacion final: " + accion + "]";
	}
	
	public AccionRecomendada getAccion() {
		return accion;
	}


	public void setAccion(AccionRecomendada accion) {
		this.accion = accion;
	}
}
