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
public class Leon extends Animal {
    // en esta clase fue implementada la herencia ya que la clase leon  comparte (hereda) los atributos de la clase padre en este caso  la clase animal

    private String color;
    private int peso;


    public Leon(String tipo, String sexo, int edad,String color, int peso) {
        super(tipo, sexo, edad);
        this.color = color;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}
