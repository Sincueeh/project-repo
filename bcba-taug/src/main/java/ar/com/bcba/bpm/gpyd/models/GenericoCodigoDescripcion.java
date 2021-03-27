package ar.com.bcba.bpm.gpyd.models;

public class GenericoCodigoDescripcion {

	private int codigo;
	private String codigoCobis; 
	private String codigoAdintar;
	private String codigoNexos; 
	private String codigoScacs; 
	private String descripcion;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCodigoCobis() {
		return codigoCobis;
	}
	public void setCodigoCobis(String codigoCobis) {
		this.codigoCobis = codigoCobis;
	}
	public String getCodigoAdintar() {
		return codigoAdintar;
	}
	public void setCodigoAdintar(String codigoAdintar) {
		this.codigoAdintar = codigoAdintar;
	}
	public String getCodigoNexos() {
		return codigoNexos;
	}
	public void setCodigoNexos(String codigoNexos) {
		this.codigoNexos = codigoNexos;
	}
	public String getCodigoScacs() {
		return codigoScacs;
	}
	public void setCodigoScacs(String codigoScacs) {
		this.codigoScacs = codigoScacs;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
