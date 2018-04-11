/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.rodriguezeduardo.interfaces;

import curso.java.becario.rodriguezeduardo.herencia.Cuadrado;
import curso.java.becario.rodriguezeduardo.polimorfismo.Triangulo;

/**
 *
 * @author JAVA1
 */

/*En esta interface colocamos las firmas de nuestros metodos que aplicaremos a los objetos en el proceso*/

public interface InterfacesServices {
    
     void aplicarEvaluacion(Cuadrado nuevo);
     void aplicarEvaluacion2(Triangulo nuevo);
    
}
