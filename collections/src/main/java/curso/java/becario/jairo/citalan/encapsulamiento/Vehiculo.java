package curso.java.becario.jairo.citalan.encapsulamiento;

public class Vehiculo {
	private String matricula;
	private String modelo;
	private int potencia;
	private double kilometrosRecorridos;

	
	public Vehiculo(String matricula,String modelo,int potencia,double kilometrosRe) {
		this.matricula=matricula;
		this.modelo=modelo;
		this.potencia=potencia;
		this.kilometrosRecorridos=kilometrosRe;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	public double getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}


	public void setKilometrosRecorridos(double kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}
	
	
	
	
}
