/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.daniel.garcia.encapsulamiento;

/**
 *
 * @author JAVA1
 */
public class Equipo {
    //Aqui se puede ver una implementación de encapsulamiento. Se restringe el acceso a algunos elementos.
    private String nombre_equipo;
    private String pais;
    private String division;

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public String getPais() {
        return pais;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
  
    
}
