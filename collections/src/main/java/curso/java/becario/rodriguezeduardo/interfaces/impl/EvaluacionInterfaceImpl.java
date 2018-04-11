/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.rodriguezeduardo.interfaces.impl;

import curso.java.becario.rodriguezeduardo.herencia.Cuadrado;
import curso.java.becario.rodriguezeduardo.polimorfismo.Triangulo;
import curso.java.becario.rodriguezeduardo.interfaces.InterfacesServices;

/**
 *
 * @author JAVA1
 */
public class EvaluacionInterfaceImpl implements InterfacesServices{

    public void aplicarEvaluacion(Cuadrado nuevo) {
        nuevo.getLado();
        nuevo.getAreaCuad();
        nuevo.getPerimetroCuad();
        
    System.out.println("El área del cuadrado obtenido es: " + nuevo.getAreaCuad()+"\n y su perimetro: "+nuevo.getPerimetroCuad());
    
        
        
    }

    public void aplicarEvaluacion2(Triangulo nuevo) {
        nuevo.getAreaTri();
        nuevo.getPerimetroTri();
        System.out.println("El área del triangulo obtenido es: " + nuevo.getAreaTri()+"\n y su perimetro: "+nuevo.getPerimetroTri());
    }
    
   
    
    
   
    
}
