/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.rodriguezeduardo.encapsulamiento;

import curso.java.becario.rodriguezeduardo.herencia.Cuadrado;
import curso.java.becario.rodriguezeduardo.interfaces.impl.EvaluacionInterfaceImpl;
import curso.java.becario.rodriguezeduardo.polimorfismo.Triangulo;
import curso.java.becario.rodriguezeduardo.interfaces.InterfacesServices;

/**
 *
 * @author JAVA1
 */
public class Ejecutable {
    public static void main(String[] args){
       InterfacesServices entidad = new EvaluacionInterfaceImpl();
        Cuadrado cuadrito = new Cuadrado();
        cuadrito.setLado(4);
        cuadrito.setAreaCuad(16);
        cuadrito.setPerimetroCuad(16);
        entidad.aplicarEvaluacion(cuadrito);
        
       /*trabajamos la otra forma*/
        Triangulo triangulito = new Triangulo();
        triangulito.setAreaTri(6, 6);
        triangulito.setPerimetroTri(4, 5, 6);
        entidad.aplicarEvaluacion2(triangulito);
        
    }
    
}
