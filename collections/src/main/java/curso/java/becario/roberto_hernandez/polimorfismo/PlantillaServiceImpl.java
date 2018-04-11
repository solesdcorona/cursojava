package curso.java.becario.roberto_hernandez.polimorfismo;

import curso.java.becario.roberto_hernandez.herencia.Herencia;

public class PlantillaServiceImpl implements PlantillaService{

    public void crearAnimal(Herencia her) {
        System.out.println("Nombre: "+ her.getNombre()+"\nSexo: "+her.getSexo()+ "\nSonido: "+ her.getSonido());
    }
    
}
