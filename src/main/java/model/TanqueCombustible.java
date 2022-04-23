package model;

public class TanqueCombustible {
	static Double MIN_LTS = 0.0;
	static Double MAX_LTS = 60.0;
	public Double cargaLts;
	
	public TanqueCombustible() {
		cargaLts = 0.0;
	}	
	
	public Double getCargaLts() {
		return cargaLts;
	}

	public void setCargaLts(Double cargaLts) throws IllegalArgumentException {
		
		if (cargaLts > MAX_LTS) {
			throw new IllegalArgumentException("cargaLts: maximo valor permitido " + MAX_LTS + " lts.");
		}
		
		if (cargaLts < MIN_LTS) {
			throw new IllegalArgumentException("cargaLts no puede ser negativo");
		}
		
		this.cargaLts = cargaLts;
	}

	@Override
	public String toString() {
		return "TanqueCombustible [cargaLts=" + cargaLts + " lts.]";
	}
	
}
