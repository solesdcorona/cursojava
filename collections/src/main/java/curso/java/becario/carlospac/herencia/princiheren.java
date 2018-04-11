/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.carlospac.herencia;

/**
 *
 * @author JAVA12
 */
public class princiheren {
    
         public static void main(String[] args){
    ClaseHijo2 here=new ClaseHijo2();
    /*La herencia permite obtener elementos de la clase padre, a su vez podemos
    heredar del hijo, siempre y cuando l clase que hereda sea a su vez hijo 
    en el ejemplo se ClaseHijo hereda de la clase DatosGenerales
    y ClaseHijo2 hereda de ClaseHijo, por lo tanto también hereda de DatosGenerales
    */ 
         here.setClave1(230); //Se aplica la herencia al utilizar Clave1 de la ClaseHijo
         here.setClave2(30);
         here.setNombre("Carlos");//A su vez estoy obteniendo Nombre de la clase DatosGenerales
         
         System.out.println("El nombre es: " + here.getNombre() );
         System.out.println("Las claves son: " + here.getClave1() + " y " + here.getClave2() );
         }
    
}
