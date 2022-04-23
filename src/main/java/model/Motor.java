package model;

public class Motor {
	
	Arranque  arranque;
	Fuerza  fuerza;
	
	Boolean presentaExplosiones;
	Boolean presentaGolpes;
	
	public Motor() {
		arranque = Arranque.NoInformado;
		fuerza = Fuerza.NoInformado;
		presentaExplosiones = false;
		presentaGolpes = false;
	}
	
	public Arranque getArranque() {
		return arranque;
	}

	public void setArranque(Arranque arranque) {
		this.arranque = arranque;
	}

	public Fuerza getFuerza() {
		return fuerza;
	}

	public void setFuerza(Fuerza fuerzaMotor) {
		this.fuerza = fuerzaMotor;
	}

	public Boolean getPresentaExplosiones() {
		return presentaExplosiones;
	}

	public void setPresentaExplosiones(Boolean presentaExplosiones) {
		this.presentaExplosiones = presentaExplosiones;
	}

	public Boolean getPresentaGolpes() {
		return presentaGolpes;
	}

	public void setPresentaGolpes(Boolean presentaGolpes) {
		this.presentaGolpes = presentaGolpes;
	}

	@Override
	public String toString() {
		return "Motor [arranque=" + arranque + ", fuerzaMotor=" + fuerza + ", presentaExplosiones=" + presentaExplosiones + ", presentaGolpes=" + presentaGolpes + "]";
	}
}
