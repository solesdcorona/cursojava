/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.minely.pereyra.execute;

import curso.java.becario.minely.pereyra.herencia.Herencia;
import curso.java.becario.minely.pereyra.herencia.Herencia2;
import curso.java.becario.minely.pereyra.impl.PolimorfismoImpl;
import curso.java.becario.minely.pereyra.polimorfismo.Polimorfismo;

/**
 *
 * @author JAVA1
 */
public class Execute {
    
    public static void main (String args [])
    {
    
        Polimorfismo varPolimorfismo = new PolimorfismoImpl();
        
        Herencia carroCuatro = new Herencia();
        
        carroCuatro.setAño(1995);
        carroCuatro.setMarca("Susuki");
        carroCuatro.setModelo("C200");
        carroCuatro.setNumAsientos(5);
        carroCuatro.setNumVentanas(10);
        carroCuatro.setLrtKm(13);
        
        varPolimorfismo.rendimiento(carroCuatro);
        
        Polimorfismo varPolimorfismo2 = new PolimorfismoImpl();
        
        Herencia2 bicicleta = new Herencia2();
        
        bicicleta.setPesoBicicleta(20);
        bicicleta.setPesoConductor(50);
        bicicleta.setAño(2000);
        bicicleta.setMarca("Benoto");
        bicicleta.setModelo("Nimbus2000");
        
        varPolimorfismo2.rendimiento(bicicleta);
        
    }
    
}
