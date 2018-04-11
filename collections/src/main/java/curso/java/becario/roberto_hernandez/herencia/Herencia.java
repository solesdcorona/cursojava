package curso.java.becario.roberto_hernandez.herencia;

import curso.java.becario.roberto_hernandez.encapsulamiento.Animal;

public class Herencia extends Animal{
    String sonido;
    public Herencia(String nombre, String sexo, int edad, String sonido) {
        super(nombre, sexo, edad);
        this.sonido = sonido;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
    
}
