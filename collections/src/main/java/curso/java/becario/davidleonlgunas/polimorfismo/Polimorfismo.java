package curso.java.becario.davidleonlgunas.polimorfismo;

import java.util.Scanner;

import curso.java.becario.davidleonlgunas.encapsulamiento.Encapsulamiento;
import curso.java.becario.davidleonlgunas.herencia.Herencia;

public class Polimorfismo {
	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
	
	PolimorfismoInterface s=new Herencia();
	//se usa polimorfismo porque le indicamos a la variable 
	//que puede ser de cualquier tipo
	
	Encapsulamiento Auto=new Encapsulamiento();
	
	System.out.println("de que color es? ");
	String Colores=entrada.nextLine();
	Auto.setColor(Colores);
	System.out.println("Cuantas llantas tiene ");
	int Llantitas=entrada.nextInt();
	Auto.setLlantas(Llantitas);
	System.out.println("Cuantas puertas? ");
	int Puertitas=entrada.nextInt();
	Auto.setPuertas(2);
	
	if(Auto.getLlantas()<=4) {
		s.metodouno(Auto);
	}else {
		s.metodoDos(Auto);
	}
	

	
	
	
	}

}