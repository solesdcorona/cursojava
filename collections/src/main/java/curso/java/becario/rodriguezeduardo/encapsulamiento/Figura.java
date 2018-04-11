/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.rodriguezeduardo.encapsulamiento;

/**
 *
 * @author JAVA1
 */

/*En esta parte comenzamos a encapsular nuestro trabajo de manera basica al colocar los atributos de la clase en private*/

public class Figura {
    private float area = 0;
    private float perimetro = 0;    
    
    public void setAreaCuad(float ladoEntrada){
        area = ladoEntrada*ladoEntrada;
    }
    
    public void setPerimetroCuad(float ladoEntrada){
      perimetro = ladoEntrada*4;
      
    }
    
    public float getAreaCuad(){
      return area;
    }
    public float getPerimetroCuad(){
      return perimetro;
          }
    
    public void setAreaTri(float baseEntrada, float h){
        area = (baseEntrada * h) / 2;
    }
    
    public void setPerimetroTri(float ladoEntrada1, float ladoEntrada2, float ladoEntrada3){
      perimetro = ladoEntrada1+ladoEntrada2+ladoEntrada3;
      
    }
    
    public float getAreaTri(){
      return area;
    }
    public float getPerimetroTri(){
      return perimetro;
    }
      
    
}
