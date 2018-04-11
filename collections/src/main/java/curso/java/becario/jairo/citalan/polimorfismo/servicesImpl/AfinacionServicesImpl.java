package curso.java.becario.jairo.citalan.polimorfismo.servicesImpl;

import curso.java.becario.jairo.citalan.herencia.Taxi;
import curso.java.becario.jairo.citalan.polimorfismo.services.AfinacionService;

public class AfinacionServicesImpl implements AfinacionService {

	public void calculaAfinacion(Taxi taxi) {
	if(taxi.getKilometrosRecorridos()>60000) {
		System.out.println("necesita kit de afinacion");
	}else {
		System.out.println("!!!Todavia puedes seguir andando");
	}
		
	}
	
	

}
