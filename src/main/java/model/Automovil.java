package model;

public class Automovil {

	Motor motor;
	Bateria bateria;
	TanqueCombustible tanque;
	public Recomendacion recomendacion;
	
	public Automovil(Motor motor, Bateria bateria, TanqueCombustible tanque) {
		this.motor = motor;
		this.bateria = bateria;
		this.tanque = tanque;
		this.recomendacion = new Recomendacion();
	}

	public Motor getMotor() {
		return motor;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}

	public TanqueCombustible getTanque() {
		return tanque;
	}

	public void setTanque(TanqueCombustible tanque) {
		this.tanque = tanque;
	}
	
	public Recomendacion getRecomendacion() {
		return recomendacion;
	}

	public void setRecomendacion(Recomendacion recomendacion) {
		this.recomendacion = recomendacion;
	}
}
