package curso.java.becario.luisromero.polimorfismo;

import curso.java.becario.luisromero.encapsulamiento.Animal;
import curso.java.becario.luisromero.herencia.Lagarto;
import curso.java.becario.luisromero.herencia.Perro;

public class EjemploPolimorfismo {

    public static void main(String[] args) {
        //Estas son las instancias de las clases Perro y Lagarto heredadas de Animal 
        //El polimorfismo consiste en crear distintos objetos de una misma clase pero se diferencian a traves 
        // de los contructores llamados
        Animal loAnimal1 = new Perro("pequeño", 4, "cafe", true);
        Animal loAnimal2 = new Lagarto("grande", 4, "verde", false, true, true);
        System.out.println("Estas son las propiedades del primer animal");
        System.out.println(loAnimal1.getColor());
        System.out.println(loAnimal1.getNumeroPatas());
        System.out.println(loAnimal1.getTamanio());
        System.out.println(loAnimal1.isViviparo());
        
        System.out.println("Estas son las propiedades del segundo animal");
        System.out.println(loAnimal2.getColor());
        System.out.println(loAnimal2.getNumeroPatas());
        System.out.println(loAnimal2.getTamanio());
        System.out.println(loAnimal2.isViviparo());
        
       
        
    }

}
