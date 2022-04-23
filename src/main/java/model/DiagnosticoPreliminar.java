package model;

public class DiagnosticoPreliminar {
	 public NivelBateria nivelBateria;
	 public NivelCombustible nivelCombustible;
	 public ResultadoDiagnosticoPreliminar resultado;
	 
	 public  DiagnosticoPreliminar() {
		 this.nivelBateria = NivelBateria.NoDeterminado;
		 this.nivelCombustible = NivelCombustible.NoDeterminado;
		 this.resultado = ResultadoDiagnosticoPreliminar.NoDeterminado;
	 }

	public NivelBateria getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(NivelBateria nivelBateria) {
		this.nivelBateria = nivelBateria;
	}

	public NivelCombustible getNivelCombustible() {
		return nivelCombustible;
	}

	public void setNivelCombustible(NivelCombustible nivelCombustible) {
		this.nivelCombustible = nivelCombustible;
	}

	public ResultadoDiagnosticoPreliminar getResultado() {
		return resultado;
	}

	public void setResultado(ResultadoDiagnosticoPreliminar resultado) {
		this.resultado = resultado;
	}
}
