/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.jonathanzamora.polimorfismo;
import curso.java.becario.jonathanzamora.herencia.*;// permiso para acceder a las clases encapsuladas que manejan la herencia
import curso.java.becario.jonathanzamora.encapsulamiento.Propietario;// permiso para acceder a la clase propietario que se encuentra encapsulada

/**
 *
 * @author JAVA1
 */
public interface Mascota {//interfaz de nombre Mascota para la comunicacion entre Perro y Propietario
    void perroPertecePersona(Perro perro, Propietario propietario);
    void gatoPertenecePersona (Gato gato, Propietario propietario);
}
