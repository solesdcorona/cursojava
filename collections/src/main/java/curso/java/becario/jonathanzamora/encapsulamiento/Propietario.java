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
public class Propietario { //Propietario es una clase a la cual no tiene acceso ningun otro paquete, por eso entra en Encapsulamiento
    private String nombre;
    private String residencia;
    private int edad;

    public String getNombre() {//getNombre de Propietario
        return nombre;
    }

    public void setNombre(String nombre) {//setNombre de Propietario
        this.nombre = nombre;
    }

    public String getResidencia() {//getResidencia de Propietario
        return residencia;
    }

    public void setResidencia(String residencia) {//setResidencia de Propietario
        this.residencia = residencia;
    }

    public int getEdad() {//getEdad de Propietario
        return edad;
    }

    public void setEdad(int edad) {//setEdad de Propietario
        this.edad = edad;
    }
    
}
