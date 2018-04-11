/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.urbanoceron.herencia;

import curso.java.becario.urbanoceron.encapsulamiento.Auto;

/**
 *
 * @author JAVA1
 */
/* -------- HERENCIA ---------*/
/* -------- CLASE HIJA DONDE EXTENDEMOS DE LA CLASE PADRE*/
public class Propietario extends Auto{
    public String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
