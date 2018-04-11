/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.arturobravo.polimorfismo;

import curso.java.becario.arturobravo.herencia.Leon;
import curso.java.becario.arturobravo.herencia.Perro;

/**
 *
 * @author JAVA1
 */
public interface AnimalService {
    void correrAnimal(String mensaje);
    void comerAnimal(Perro perro);
    void comerAnimal(Leon leon);
}
