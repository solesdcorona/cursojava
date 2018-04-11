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
public class LeonServiceImpl implements AnimalService{

    public void correrAnimal(String mensaje) {
        System.out.println(mensaje);
    }

    public void comerAnimal(Perro perro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void comerAnimal(Leon leon) {
        System.out.println("este animal es un " + leon.getTipo()+" "+ "de color " + leon.getColor() + " " +"el cual come 30 kilos de carne al dia" );

    }
    
}
