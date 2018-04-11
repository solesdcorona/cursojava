/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.jonathanzamora.herencia;

import curso.java.becario.jonathanzamora.encapsulamiento.Animal;

/**
 *
 * @author JAVA1
 */
public class Perro extends Animal { //Aqui es donde se aplica la herencia, la clase perro hereda los atributos de Animal
    private String raza;
    private String nombre;

    public Perro() {//Constructor de Perro
    }

    public String getRaza() {//getRaza de Perro
        return raza;
    }

    public void setRaza(String raza) {//setRaza de Perro
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
