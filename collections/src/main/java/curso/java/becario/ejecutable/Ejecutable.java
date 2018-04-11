package curso.java.becario.ejecutable;

import curso.java.becario.herencia.Informacion;
import curso.java.becario.polimorfismo.JuegoService;
import curso.java.becario.polimorfismo.JuegoServiceImpl;
//---------------------Este es el menu Ejecutable de Videojuegos-----------------------------------------------
public class Ejecutable {
	public static void main(String args[]) {
		//Se hace instancia a la clase Informacion ya que esta contendra toda la informacion de un videojuego
		Informacion juego = new Informacion();
		//Hace instancia a la inteface JuegoService.
		JuegoService servicio = new JuegoServiceImpl();
		//se agrega los valores para un nuevo juego... Estas variables son de la clase Videojuegos
		juego.setVideojuego("Call Of Duty WW2", 1018, "Shooter");
		//Se agrega la clasificacion del juego... esta variable esta en la clase informacion.
		juego.setClasificacion("+18");
		//Iniciamos el Polimorfismo con los datos del juego.
		servicio.agregarJuego(juego);
		servicio.jugar(juego);
	}
}
