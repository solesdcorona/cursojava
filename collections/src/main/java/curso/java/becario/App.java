package curso.java.becario;

import curso.java.becario.jairo.citalan.herencia.Taxi;
import curso.java.becario.jairo.citalan.polimorfismo.services.AfinacionService;
import curso.java.becario.jairo.citalan.polimorfismo.servicesImpl.AfinacionServicesImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AfinacionService afs=new AfinacionServicesImpl();
       Taxi tax=new Taxi("6253sgsgs","jjffhfyfy","2018",3600,45000.00);
       
       afs.calculaAfinacion(tax);
       
    }
}
