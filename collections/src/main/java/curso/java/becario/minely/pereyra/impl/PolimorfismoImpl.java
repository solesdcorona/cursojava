/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.minely.pereyra.impl;

import curso.java.becario.minely.pereyra.herencia.Herencia;
import curso.java.becario.minely.pereyra.herencia.Herencia2;
import curso.java.becario.minely.pereyra.polimorfismo.Polimorfismo;

//Se implementa la funcion de rendimiento para cada uno de los casos 

public class PolimorfismoImpl implements Polimorfismo{

    public void rendimiento(Herencia carro) {
        
        String marca=carro.getMarca();
        String modelo=carro.getModelo();
        int año=carro.getAño();
        int ltrKm=carro.getLrtKm();
        
        System.out.println("El carro con marca "+marca+" del modelo "+modelo+" año "+año+"\n"
                + " Tiene un rendimiento litros/kilometros de "+ltrKm);
        
    }

    public void rendimiento(Herencia2 bicicleta) {
    
        String marca= bicicleta.getMarca();
        String modelo = bicicleta.getModelo();
        int año=bicicleta.getAño();
        int pesoBici=bicicleta.getPesoBicicleta();
        int pesoConductor=bicicleta.getPesoConductor();
 
     System.out.println("La bici con marca "+marca+" del modelo "+modelo+" año "+año+"\n"
                + " Tiene un rendimiento de "+ pesoConductor/pesoBici);
      
    }
    
}
