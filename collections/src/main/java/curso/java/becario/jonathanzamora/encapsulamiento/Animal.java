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
    private String tama�o;
    private String color;
    private String alimentacion;

    public Animal() {//Constructor de animal
    }

    public String getTama�o() {//getTama�o de Animal
        return tama�o;
    }

    public void setTama�o(String tama�o) {//serTama�o de Animal
        this.tama�o = tama�o;
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
