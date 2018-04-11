/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.urbanoceron.encapsulamiento;

/* ----------- CLASE PADRE ----------------*/
/* ENCAPSULAMOS LOS ATRIBUTOS EN ESTA CLASE Y SOLO SU 
   MODIFICACION PUEDE SER MEDIANTE METODOS DEFINIDOS. */
public class Auto {

    /*------- ATRIBUTOS ---------*/
    private String marca;
    private int modelo;

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
}
