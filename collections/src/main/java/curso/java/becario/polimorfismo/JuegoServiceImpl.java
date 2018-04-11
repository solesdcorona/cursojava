package curso.java.becario.polimorfismo;

import curso.java.becario.encapsulamiento.Videojuegos;
import curso.java.becario.herencia.Informacion;

public class JuegoServiceImpl implements JuegoService{
//-------------------------POLIMORFISMO---------------------------------
	// Aqui se genera la funcion que hara el polimorfismo, si se crea otro metodo tendra diferente la funcion.
	public void agregarJuego(Informacion cod) {
		// TODO Auto-generated method stub
		//Se imprime la informacion del juego añadido.
		System.out.println("Nombre de juego: "+cod.getNombre()+"\nAño de estreno: "+cod.getAñoEstreno()+"\nGenero: "+cod.getGenero()+"\nClasificacion: "+cod.getClasificacion());
	}
		//este es un ejemplo mandando un mensaje que se esta jugando dicho juego 
	public void jugar(Informacion cod) {
		// TODO Auto-generated method stub
		System.out.println("Estas Jugando el juego de "+cod.getNombre());
	}



}
