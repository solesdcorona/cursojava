/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.arturobravo.herencia;

import curso.java.becario.arturobravo.encapsulamiento.Animal;

/**
 *
 * @author JAVA1
 */
public class Perro extends Animal{
    // en esta clase fue implementada la herencia ya que la clase perro  comparte (hereda) los atributos de la clase padre en este caso  la clase animal
    private String nombre;
    private String color;
    private String raza;

    public Perro(String nombre, String color, String raza, String tipo, String sexo, int edad) {
        super(tipo, sexo, edad);
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}
