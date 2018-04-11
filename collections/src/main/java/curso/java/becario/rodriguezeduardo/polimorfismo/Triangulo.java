/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.rodriguezeduardo.polimorfismo;

import curso.java.becario.rodriguezeduardo.encapsulamiento.Figura;

/**
 *
 * @author JAVA1
 */
/*En conjunto con la clase Cuadrado se representa el polimorfismo ya que nuestra clase padre Figura toma diferentes formas y caracteristicas
además de las ya tenidas desde un principio
*/
public class Triangulo extends Figura{
    private float altura;
    private float lado1;
    private float lado2;
    private float lado3;
    private float base;
    
    public void setAltura(float alto){
        altura = alto;    
    }
    
    public void setLados(float l1,float l2, float l3){
       lado1 = l1; 
        lado2 = l2; 
        lado3 =l3;
    }
    
    public void setBase(float b){
        base = b;    
    }
    
    public float getAltura(){
        return altura;    
    }
    
    public float getLado1(){
       return lado1;    
    }
    
    public float getLado2(){
        return lado2;    
    }
    
    public float getLado3(){
        return lado3;    
    }
    
    public float getBase(){
        return base;    
    }
    
}
