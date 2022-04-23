package model;

public enum AccionRecomendada {

	NoEncontrada,
	CargarBateria,
	CargarCombustible,
	LimpiarTuberiasCombustible,
	AjustarTimingMotor,
	AjustarPuntosDeInyeccion;
	
	public Boolean isa(AccionRecomendada recomendacion) {
		return this.toString() == recomendacion.toString();
	}
}
