package curso.java.becario.polimorfismo;

import curso.java.becario.herencia.Informacion;
//-------------------------Polimorfismo------------------------------------------
public interface JuegoService {
	// se crea un metodo para hacer la estructura de codigo... por default el metodo es publico por lo cual no se le agrega public
	//Aqui se da uso el polimorfismo ya que aqui se especifica un objeto 
	void agregarJuego(Informacion cod);
	void jugar(Informacion cod);
}
