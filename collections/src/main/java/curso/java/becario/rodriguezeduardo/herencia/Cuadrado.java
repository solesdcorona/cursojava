/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.rodriguezeduardo.herencia;

import curso.java.becario.rodriguezeduardo.encapsulamiento.Figura;

/**
 *
 * @author JAVA1
 */

/*Aquí comenzamos a aplicar nuestra definicion de herencia al heredar las caracteristicas del padre Figura a la clase hija cuadrado*/
public class Cuadrado extends Figura{
    private float lado;
    
    public void setLado(float ladoRecibido){
      lado = ladoRecibido;
    }
    
     public float getLado(){
      return lado;
    }
    
}
