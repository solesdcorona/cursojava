/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.minely.pereyra.herencia;
import curso.java.becario.minely.pereyra.encapsulamiento.Encapsulamiento;

//La clase herencia es el encapsulamiento de atributos de un carro, y ademas tiene pues variables
//que solamente son propias de un carro, como las ventanas, pero hereda todos los datos que son
//del automovil, por ejemplo la marca/modelo/año.

public class Herencia extends Encapsulamiento{
    
    private int numVentanas;
    private int numAsientos;
    private int lrtKm;


    public int getLrtKm() {
        return lrtKm;
    }

    public void setLrtKm(int lrtKm) {
        this.lrtKm = lrtKm;
    }

    public int getNumVentanas() {
        return numVentanas;
    }

    public void setNumVentanas(int numVentanas) {
        this.numVentanas = numVentanas;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }
    
    
}
