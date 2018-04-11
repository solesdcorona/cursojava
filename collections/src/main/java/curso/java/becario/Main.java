package curso.java.becario;

import curso.java.becario.daniel.garcia.herencia.Jugador;
import curso.java.becario.daniel.garcia.herencia.polimorfismo.TransferenciaServiceImpl;
import curso.java.becario.daniel.garcia.service.TransferenciaService;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {        
        
        TransferenciaService tf=new TransferenciaServiceImpl();
        
        Jugador []jugadores=new Jugador[4];
        //Aqui se pueden ver ejemplos de poloformismo. (Asignación de tipos diferentes a un objeto)
        jugadores[0]=new Jugador();
        jugadores[0].setNombre("Messi");
        jugadores[0].setEdad(24);
        jugadores[0].setDivision("Primera");
        jugadores[0].setNcamiseta(10);
        jugadores[0].setNombre_equipo("Barcelona");
        jugadores[0].setPrecio(100000000);
        jugadores[0].setPais("Argentina");
        
        jugadores[1]=new Jugador();
        jugadores[1].setNombre("Chicharito");
        jugadores[1].setEdad(25);
        jugadores[1].setDivision("Primera");
        jugadores[1].setNcamiseta(14);
        jugadores[1].setNombre_equipo("WestHam");
        jugadores[1].setPrecio(60000000);
        jugadores[1].setPais("México");
        
        jugadores[2]=new Jugador();
        jugadores[2].setNombre("Hirving Lozano");
        jugadores[2].setEdad(22);
        jugadores[2].setDivision("Primera");
        jugadores[2].setNcamiseta(10);
        jugadores[2].setNombre_equipo("PSV");
        jugadores[2].setPrecio(40000000);
        jugadores[2].setPais("México");
   
        
        jugadores[3]=new Jugador();
        jugadores[3].setNombre("Juan");
        jugadores[3].setEdad(28);
        jugadores[3].setDivision("Segunda");
        jugadores[3].setNcamiseta(14);
        jugadores[3].setNombre_equipo("Zacatecas");
        jugadores[3].setPrecio(200000);
        jugadores[3].setPais("México");
        
        tf.validarDatosDeTransferencia(jugadores);
    }
}
