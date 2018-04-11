package curso.java.becario.encapsulamiento;
//Videojuegos es la clase padre
public class Videojuegos {
	//---------------------------------ENCAPSULAMIENTO--------------------------------
	//El elcapsulamiento inicia cuando se genera el package, y despues a continuacion las variables se declaran en private
	private String nombre,genero;
	private int a�oEstreno;
	//metodo set para guardar los datos en sus respectivas variables.
	public void setVideojuego(String nombre,int a�oEstreno,String genero) {
		this.nombre=nombre;
		this.a�oEstreno=a�oEstreno;
		this.genero=genero;
	}
	//Metodo get para obtener el contenido de la variable nombre.
	public String getNombre() {
		return nombre;
	}
	//Metodo get para obtener el contenido de la variable a�oEstreno.
	public int getA�oEstreno() {
		return a�oEstreno;
	}
	//Metodo get para obtener el contenido de la variable genero.
	public String getGenero() {
		return genero;
	}
}
