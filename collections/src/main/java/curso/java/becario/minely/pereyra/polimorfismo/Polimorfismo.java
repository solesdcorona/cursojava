/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.minely.pereyra.polimorfismo;

import curso.java.becario.minely.pereyra.herencia.Herencia;
import curso.java.becario.minely.pereyra.herencia.Herencia2;

//Se declaran las funciones/comportamientos que todos los medios de transporte tienen en comun

public interface Polimorfismo {
    
    void rendimiento (Herencia carro);
    void rendimiento (Herencia2 bicicleta);
}
