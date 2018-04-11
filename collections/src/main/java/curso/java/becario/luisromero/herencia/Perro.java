package curso.java.becario.luisromero.herencia;

import curso.java.becario.luisromero.encapsulamiento.Animal;

public class Perro extends Animal { //En esta linea la clase Perro hereda las propiedades y metodos de la clase Animal

    private String raza; //En esta linea la clase perro contiene una variable propia

    public Perro(String tamanio, int numeroPatas, String color, boolean viviparo) {
        super(tamanio, numeroPatas, color, viviparo);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void ladrar() { //Este es el metodo que solo la clase perro puede ocupar
        System.out.println("Guau");
    }
}
