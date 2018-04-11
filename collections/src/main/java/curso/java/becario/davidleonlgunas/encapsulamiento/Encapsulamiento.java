package curso.java.becario.davidleonlgunas.encapsulamiento;

public class Encapsulamiento {

	
	//aqui aplico encapsulamiento ya que son variables que no pueden ser modificadas por cualquier metodo
	private String Vehiculo;
	private int Llantas;
	private int Puertas;
	private String Color;
	
	
	
	//metodos set y get que podran modificar mis variables
	
	public void setLlantas(int Rueda) {
		Llantas=Rueda;
	}
	
	public int getLlantas() {
		return Llantas;
	}
	public void setPuertas(int Puerta) {
		Puertas=Puerta;
	}
	
	public int getPuertas() {
		return Puertas;
	}
	public void setColor(String Col) {
		Color=Col;
	}
	
	public String getColor() {
		return Color;
	}
		
	}


