package ec.edu.ups.EN;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class ENVehiculo implements Serializable {
	@Id
	private int veId;
	private String vePlaca;
	private String veDescripcion;
	private String veMarca;
	
	public int getVeId() {
		return veId;
	}
	public void setVeId(int veId) {
		this.veId = veId;
	}
	public String getVePlaca() {
		return vePlaca;
	}
	public void setVePlaca(String vePlaca) {
		this.vePlaca = vePlaca;
	}
	public String getVeDescripcion() {
		return veDescripcion;
	}
	public void setVeDescripcion(String veDescripcion) {
		this.veDescripcion = veDescripcion;
	}
	public String getVeMarca() {
		return veMarca;
	}
	public void setVeMarca(String veMarca) {
		this.veMarca = veMarca;
	}
	@Override
	public String toString() {
		return "ENVehiculo [veId=" + veId + ", vePlaca=" + vePlaca + ", veDescripcion=" + veDescripcion + ", veMarca="
				+ veMarca + "]";
	}
	

}
