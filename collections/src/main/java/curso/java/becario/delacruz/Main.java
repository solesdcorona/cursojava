package curso.java.becario.delacruz;
import curso.java.becario.delacruz.*;
import curso.java.becario.delacruz.herencia.Perros;
import curso.java.becario.delacruz.polimorfismo.RegistroMascotas;
import curso.java.becario.delacruz.polimorfismo.RegistroMascotasInterface;

public class Main {
        public static void main(String[] args) {
               RegistroMascotasInterface registro = new RegistroMascotas() {};
               Perros firulais= new Perros();
               firulais.setNombre("Firulais");
               firulais.setDuenio("Maximiliano");
               registro.registrarMascota(firulais);           
    }
}


