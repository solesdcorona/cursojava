/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.urbanoceron.polimorfismo;

import curso.java.becario.urbanoceron.herencia.Propietario;
import curso.java.becario.urbanoceron.herencia.PropietarioServiceImpl;

public class Principal {
    
    public static void main(String argumentos[]){
        /* PARTE DONDE SE APLICA EL POLIMORFISMO*/
        PropietarioService propietarioService = new PropietarioServiceImpl();
        
        Propietario propietario = new Propietario();
        propietario.setNombre("Urbano");
        propietario.setModelo(1998);
        propietario.setMarca("Chevrolet");
        
        propietarioService.consultarPropietario(propietario);
    }
    
}
