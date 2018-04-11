/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.daniel.garcia.herencia;

import curso.java.becario.daniel.garcia.encapsulamiento.Equipo;

/**
 *
 * @author JAVA1
 */

//Aqui se implementa la herencia ya que el jugador obtiene datos de equipo
public class Jugador extends Equipo{
     //Aqui tambien se puede ver una implementación de encapsulamiento. Se restringe el acceso a algunos elementos.
    private String nombre;
    private int edad;
    private int ncamiseta;
    private String posicion;
    private int precio_dolar;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNcamiseta() {
        return ncamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNcamiseta(int ncamiseta) {
        this.ncamiseta = ncamiseta;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getPrecio() {
        return precio_dolar ;
    }

    public void setPrecio(int precio) {
        this.precio_dolar = precio;
    }
    
    
    
    
}
