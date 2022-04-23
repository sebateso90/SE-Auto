package model;

public enum Fuerza {

	Debil,
	Normal,
	NoInformado;
	
	public  Boolean isa(Fuerza fuerzaMotor) {
		return this.toString() == fuerzaMotor.toString();
	}
}
