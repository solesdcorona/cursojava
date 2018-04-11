package curso.java.becario.jairo.citalan.herencia;

import curso.java.becario.jairo.citalan.encapsulamiento.Vehiculo;

public class Taxi extends Vehiculo {
	private String numeroLicencia;
	
	
	public Taxi(String numeroLic,String matricula,String modelo,int potencia,double kilometrosRecorridos) {
		super(matricula,modelo,potencia,kilometrosRecorridos);
		this.numeroLicencia=numeroLic;
		}


	public String getNumeroLicencia() {
		return numeroLicencia;
	}


	public void setNumeroLicencia(String numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}


	
	
	
	
	

}
