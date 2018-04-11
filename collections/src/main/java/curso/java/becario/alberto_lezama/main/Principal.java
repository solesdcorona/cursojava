/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.alberto_lezama.main;

import curso.java.becario.alberto_lezama.herencia.Circulo;
import curso.java.becario.alberto_lezama.Encapsulamiento.FigurasGeometricas;
import curso.java.becario.alberto_lezama.polimorfismo.ImplementService;
import curso.java.becario.alberto_lezama.polimorfismo.ServiceArea;


public class Principal {
    
    public static void main(String[] args) {
         
        ServiceArea sa= new ImplementService();
        Circulo c = new Circulo(5.0,3.0);
        
        
        sa.calcularArea(c);
    }
    
   
    
   
    

    
   
    
  
}
