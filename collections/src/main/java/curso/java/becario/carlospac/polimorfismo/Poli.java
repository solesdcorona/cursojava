/*d
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.carlospac.polimorfismo;

import curso.java.becario.carlospac.herencia.ClaseHijo;

/**
 *
 * @author JAVA12
 */
public class Poli  {
    public static void main(String[] args){
  Animales p = new Perro();
    Animales g= new Gato();
    Animales r = new Raton();
    
    /*El polimorfismo se caracteriza por que las variables se pueden instanciar 
    de cualquier manera siempre y cuando sean del mismo tipo
en este caso el tipo es Animales y se puede instanciar como Perro, Gato o Raton*/
    
    Perro pr= new Perro();
    Gato ga= new Gato();
    Raton ra= new Raton();
    
    
    p.setClasificacion("Canino");

    g.setClasificacion("Felino");
  
    r.setClasificacion("Roedor");
  
    pr.setRaza("Golden");
    ga.setColor("Gris");
    ra.setNumcrias(12);
    
    System.out.println("El perro es: " + p.getClasificacion());
    System.out.println("Su raza es: " + pr.getRaza());
    System.out.println("Tiene: " + p.getPatas()+ " patas");
    
    System.out.println("El ratón es: " + r.getClasificacion());
    System.out.println("Puede tener" + ra.getNumcrias() + " crias" );
    System.out.println("Tiene: " + r.getPatas() + "patas");
    
    
    System.out.println("El gatos es: " + g.getClasificacion());
    System.out.println("Su color es:  " + ga.getColor());
    System.out.println("Tiene: " + g.getPatas());
    
    
    }
    
}
