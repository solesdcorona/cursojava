/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.jonathanzamora.main;
import curso.java.becario.jonathanzamora.encapsulamiento.*;
import curso.java.becario.jonathanzamora.herencia.*;
import curso.java.becario.jonathanzamora.polimorfismo.*;

/**
 *
 * @author JAVA1
 */
public class Principal {
    public static void main( String[] args )
    {
        Mascota ma = new MascotaImpl ();//Se crea la instancia de la implementacion de la interfaz
        Perro p = new Perro();//creacion del objeto Perro
        Gato g = new Gato();//creacion del objeto Gato
        Propietario po = new Propietario(); //
        Propietario po1 = new Propietario();
        p.setRaza("Chihuahia");
        p.setNombre("Hachiko");
        p.setAlimentacion("Omnivoro");      
        g.setRaza("Egipcio");
        g.setNombre("Wis");
        g.setAlimentacion("Omnivoro");   
        po.setNombre("Pancho");
        po.setEdad(30);
        po1.setNombre("Jose");
        po1.setEdad(25);
        po1.setResidencia("Guadalajara");
        po.setResidencia("Ciudad de México");     
        ma.perroPertecePersona(p, po);
        ma.gatoPertenecePersona(g, po1); 
    }
}
