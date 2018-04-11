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
public class Genera implements Interfc {
//El encapsulamiento se aplica desde la interfaz
    //Permite encerrar las variables y métodos para evitar que sea accesible al usuario
    public void imprimeP (Profesor p){
    System.out.println("Nombre de profesor: " + p.getNombre());
         System.out.println("Dirección de profesor: " + p.getDirección()); 
          System.out.println("Edad de profesor: " + p.getEdad());
           System.out.println("Sueldo de profesor: " + p.getSalario());
         
         
    }
    
    
    public void imprimeA (Alumno a ){
    System.out.println("Nombre de alumno: " + a.getNombre());
         System.out.println("Dirección de alumno: " + a.getDirección()); 
          System.out.println("Edad de alumno: " + a.getEdad());
           System.out.println("Calificación alumno: " + a.getCalificaciones());
    }
    
    
    public void creaProf(Profesor p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void creaAl(Alumno a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
