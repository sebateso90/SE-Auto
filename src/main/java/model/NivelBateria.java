package model;

public enum NivelBateria {
	NoDeterminado,
	Bajo,
	Medio,
	Alto;
	
	public  Boolean isa(NivelBateria nivel) {
		return this.toString() == nivel.toString();
	}
}
