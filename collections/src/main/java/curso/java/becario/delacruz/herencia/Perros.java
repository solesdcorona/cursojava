//En esta clase se ejemplifica el uso de la herencia pues se hace uso de los 
//atributos de la clase mascotas en otro paquete.
package curso.java.becario.delacruz.herencia;
import curso.java.becario.delacruz.encapsulamiento.Mascotas;

public class Perros extends Mascotas{
    private String tipoAnimal="canino";

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    private String raza;
}
