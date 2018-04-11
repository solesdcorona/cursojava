/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.alberto_lezama.herencia;

import curso.java.becario.alberto_lezama.Encapsulamiento.FigurasGeometricas;

/**
 *
 * @author JAVA12
 */
public class Circulo extends FigurasGeometricas {
    private double radio;

    public Circulo(double lado, double radio) {
        super(lado);
        
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
