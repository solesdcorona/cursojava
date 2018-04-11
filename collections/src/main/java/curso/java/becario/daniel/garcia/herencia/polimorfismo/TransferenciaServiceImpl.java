/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.daniel.garcia.herencia.polimorfismo;

import curso.java.becario.daniel.garcia.herencia.Jugador;
import curso.java.becario.daniel.garcia.service.TransferenciaService;

/**
 *
 * @author JAVA1
 */
public class TransferenciaServiceImpl implements TransferenciaService {
    
    public void validarDatosDeTransferencia(Jugador []jugador){
        //Aqui tambien podemos ver ejemplos de poliformismo.(Asignarle tipos diferentes a un objeto)
        for(int i=0; i<jugador.length;i++){
                if(jugador[i].getPrecio()>50000000){
                      //MIentras mas caro el jugador más bueno es
                    System.out.println("El jugador"+" "+jugador[i].getNombre()+" "+
                            "que pertence al equipo"+" "+jugador[i].getNombre_equipo()+" "+
                            "va a ser transferido ya que es muy bueno");      
                }
        
        }
        
    
    }
    
    
    
}
