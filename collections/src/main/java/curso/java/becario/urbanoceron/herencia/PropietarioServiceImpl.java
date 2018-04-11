/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.urbanoceron.herencia;

import curso.java.becario.urbanoceron.polimorfismo.PropietarioService;

/**
 *
 * @author JAVA1
 */
/* ------- IMPLEMENTACION DONDE APLICACION LA HERENCIA, NO ES OBLIGATORIO HACER HERENCIA CON LA 
    LA PALABRA EXTENS, PODREMOS DECIR QUE ES HERENCIA DE UNA FORMA IMPLICITA EN ESTE EJEMPLO. */
public class PropietarioServiceImpl implements PropietarioService {

    public void consultarPropietario(Propietario propietario) {
        System.out.println("Es un carro modelo >> "+propietario.getModelo()+""
                + "\nDe la marca >> "+propietario.getMarca()+""
                + "\nEl propietario es >> "+propietario.getNombre());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
