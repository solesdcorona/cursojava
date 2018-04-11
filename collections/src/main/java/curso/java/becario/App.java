package curso.java.becario;

import curso.java.becario.roberto_hernandez.encapsulamiento.Animal;
import curso.java.becario.roberto_hernandez.herencia.Herencia;
import curso.java.becario.roberto_hernandez.polimorfismo.PlantillaServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        Animal a= new Herencia("Perro", "Macho", 1, "Wow");
        Animal b= new Herencia("Gato", "Hembra", 2, "Miau");
        PlantillaServiceImpl p= new PlantillaServiceImpl();
        p.crearAnimal((Herencia) a);
        p.crearAnimal((Herencia) b);
    }
}
