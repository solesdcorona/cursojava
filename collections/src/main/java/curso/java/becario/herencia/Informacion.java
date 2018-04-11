package curso.java.becario.herencia;

import curso.java.becario.encapsulamiento.Videojuegos;

//--------------------------------------------HERENCIA--------------------------------------
//extends hace referencia que se hara una herencia a la clase videojuegos
public class Informacion extends Videojuegos{
	//Informacion es la nueva clase en la cual va a heredar de la clase Videojuegos.
	//Se crea una variable clasificcion de tipo String
	private String clasificacion;
	//generamos un metodo set para añadir un valor a la variable clasificacion.
	public void setClasificacion(String clasificacion) {
		//se le asigna el valor a la variable clasificacion..
		this.clasificacion=clasificacion;
	}
	//se crea el metodo get para la variable clasificacion
	public String getClasificacion() {
		//se obtiene el valor de la variable clasificacion.
		return clasificacion;
	}
}
