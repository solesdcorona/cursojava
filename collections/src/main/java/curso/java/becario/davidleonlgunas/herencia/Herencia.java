package curso.java.becario.davidleonlgunas.herencia;

import curso.java.becario.davidleonlgunas.encapsulamiento.Encapsulamiento;
import curso.java.becario.davidleonlgunas.polimorfismo.PolimorfismoInterface;

public class Herencia implements PolimorfismoInterface {

	public void metodouno(Encapsulamiento Carro) {
		// TODO Auto-generated method stub
		//herencia se ocupa aqui porque estamos heredando las funciones de otros mentodos ajenos a esta clase
				System.out.println("El carro es y tiene  "+Carro.getLlantas()+ " llantas con "+
						Carro.getPuertas()+" puertas y su color es "+Carro.getColor());	
			}
	

	public void metodoDos(Encapsulamiento Furgoneta) {
		// TODO Auto-generated method stub
		//herencia se ocupa aqui porque estamos heredando las funciones de otros mentodos ajenos a esta clase
				System.out.println("La furgoneta es tiene  "+Furgoneta.getLlantas()+ " llantas con "+
						Furgoneta.getPuertas()+" puertas y su color es "+Furgoneta.getColor());	
			}
	}


