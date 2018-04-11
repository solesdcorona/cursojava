/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.jonathanzamora.encapsulamiento;

/**
 *
 * @author JAVA1
 */
public class Animal {//Clase padre que va heredar sus atributos, esta encapsulada y el paquete de herencia tiene permisos
    private String tamaño;
    private String color;
    private String alimentacion;

    public Animal() {//Constructor de animal
    }

    public String getTamaño() {//getTamaño de Animal
        return tamaño;
    }

    public void setTamaño(String tamaño) {//serTamaño de Animal
        this.tamaño = tamaño;
    }

    public String getColor() {//getColor de Animal
        return color;
    }

    public void setColor(String color) {//setColor de Animal
        this.color = color;
    }

    public String getAlimentacion() {//getAlimentacion de Animal
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {//setAlimentacion de Animal
        this.alimentacion = alimentacion;
    }
    
}
