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
public class Gato extends Animal {// Clase Gato, maneja polimorfismo ya que animal puede ser perro o gato
    private String raza;
    private String nombre;

    public Gato() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
