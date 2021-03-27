package ar.com.bcba.bpm.gpyd.models;

public class ErrorTracking {

	private int uuid;
	private Tracking tracking;
	public int getUuid() {
		return uuid;
	}
	public void setUuid(int uuid) {
		this.uuid = uuid;
	}
	public Tracking getRastreo() {
		return tracking;
	}
	public void setRastreo(Tracking tracking) {
		this.tracking = tracking;
	}
}
