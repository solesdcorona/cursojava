/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.minely.pereyra.herencia;

import curso.java.becario.minely.pereyra.encapsulamiento.Encapsulamiento;

//Lo mismo pero con bicicleta

public class Herencia2 extends Encapsulamiento{
    private int pesoConductor;
    private int pesoBicicleta;

    public int getPesoConductor() {
        return pesoConductor;
    }

    public void setPesoConductor(int pesoConductor) {
        this.pesoConductor = pesoConductor;
    }

    public int getPesoBicicleta() {
        return pesoBicicleta;
    }

    public void setPesoBicicleta(int pesoBicicleta) {
        this.pesoBicicleta = pesoBicicleta;
    }
    
    
}
