package model;

public enum NivelCombustible {
	NoDeterminado,
	Vacio,
	Bajo,
	Medio,
	Alto,
	Completo;

	public  Boolean isa(NivelCombustible nivel) {
		return this.toString() == nivel.toString();
	}
}
