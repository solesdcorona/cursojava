/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.carlospac.encapsulamiento;

/**
 *
 * @author JAVA12
 */
public class Principal {
    
     public static void main(String[] args){
    
         
         Genera ab = new Genera();
    Alumno alm = new Alumno();
    Profesor prf = new Profesor();
     
    alm.setNombre("Carlos");
    alm.setEdad(17);
    alm.setDirección("Calle 5 ");
    alm.setCalificaciones(9);
    
    prf.setDirección("Calle12");
    prf.setEdad(32);
    prf.setNombre("Ramiro");
    prf.setSalario(10000);
    ab.creaAl(alm);
    ab.creaProf(prf);
     
     }
   
    
}
