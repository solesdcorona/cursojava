//El polimorfismo se ve en la clase Main 
package curso.java.becario.delacruz.polimorfismo;

import curso.java.becario.delacruz.herencia.Perros;
import curso.java.becario.delacruz.polimorfismo.RegistroMascotasInterface;

public class RegistroMascotas implements RegistroMascotasInterface {
    public void registrarMascota(Perros nuevoPerro){
        System.out.println("Yo soy "+nuevoPerro.getNombre()+" y pertenezco a "+nuevoPerro.getDuenio()+".");
    }
}