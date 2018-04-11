/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.jonathanzamora.polimorfismo;

import curso.java.becario.jonathanzamora.encapsulamiento.Propietario;//Acceso a la clase Propietario que esta encapsulada
import curso.java.becario.jonathanzamora.herencia.Gato;
import curso.java.becario.jonathanzamora.herencia.Perro;//Acceso a la clase Propietario que esta encapsulada
/**
 *
 * @author JAVA1
 */
public class MascotaImpl implements Mascota {//Implementacion de la interfaz de Mascota

    public void perroPertecePersona(Perro perro, Propietario propietario) {
        System.out.println("El perro: "+perro.getNombre()+" Pertenece a: "+propietario.getNombre());
    }

    public void gatoPertenecePersona(Gato gato, Propietario propietario) {
        System.out.println("El Gato: "+gato.getNombre()+" Pertenece a: "+propietario.getNombre());
    }
    
}
