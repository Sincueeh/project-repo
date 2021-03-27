package ar.com.bcba.bpm.gpyd.models;

import java.util.List;

public class GenericoCodigoDescripcionResult {

	private boolean ok; 
	private List<GenericoCodigoDescripcion> genericoCodigoDescripcion;
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	public List<GenericoCodigoDescripcion> getGenericoCodigoDescripcion() {
		return genericoCodigoDescripcion;
	}
	public void setGenericoCodigoDescripcion(List<GenericoCodigoDescripcion> genericoCodigoDescripcion) {
		this.genericoCodigoDescripcion = genericoCodigoDescripcion;
	}
}
