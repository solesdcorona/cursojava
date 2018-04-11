/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.arturobravo.encapsulamiento.principal;

import curso.java.becario.arturobravo.herencia.Leon;
import curso.java.becario.arturobravo.herencia.Perro;
import curso.java.becario.arturobravo.polimorfismo.AnimalService;
import curso.java.becario.arturobravo.polimorfismo.LeonServiceImpl;
import curso.java.becario.arturobravo.polimorfismo.PerroServiceImpl;

/**
 *
 * @author JAVA1
 */
public class Principal {
    public static void main(String[] args) {
        Leon leon = new Leon("Leon", "H", 10, "azul", 20);
        Perro perro = new Perro("rocky", "verde", "Pastor Aleman", "perro", "H", 10);
// en esta clase se implementa el polimorfismo ya que la variable animal puede ser de cualquier tipo 
        AnimalService animal = new PerroServiceImpl(); // aqui la variable animal es de tipo PerroServiceImpl
        animal.correrAnimal("un perro come 30 veses menos que un leon");
        animal.comerAnimal(perro);
        System.out.println("----------------------------------------------------");
        animal = new LeonServiceImpl();// aqui la variable animal es de tipo LeonServiceImpl
        animal.correrAnimal("El leon corre 50 veses mas que un perro");
        animal.comerAnimal(leon);
    }
}
