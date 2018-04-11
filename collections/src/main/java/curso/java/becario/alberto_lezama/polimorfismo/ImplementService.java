/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.alberto_lezama.polimorfismo;

import curso.java.becario.alberto_lezama.polimorfismo.ServiceArea;
import curso.java.becario.alberto_lezama.herencia.Circulo;
import static java.lang.Math.PI;
import java.text.DecimalFormat;

/**
 *
 * @author JAVA12
 */
public class ImplementService implements ServiceArea {
DecimalFormat df = new DecimalFormat("#.00");
    public void calcularArea(Circulo c) {
       double area;
        
       area= c.getLado()* c.getRadio()* PI;
        
        System.out.println("Area: "+ df.format(area));
    }
    
}
