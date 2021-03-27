package ar.com.bcba.bpm.gpyd.models;

import java.util.List;

public class CodigoDescripcionResult {

	private boolean ok; 
	private List<CodigoDescripcion> codigoDescripcion;
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	public List<CodigoDescripcion> getCodigoDescripcion() {
		return codigoDescripcion;
	}
	public void setCodigoDescripcion(List<CodigoDescripcion> codigoDescripcion) {
		this.codigoDescripcion = codigoDescripcion;
	}
}
