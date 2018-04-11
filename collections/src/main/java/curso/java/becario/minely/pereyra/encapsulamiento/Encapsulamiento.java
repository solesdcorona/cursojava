/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.minely.pereyra.encapsulamiento;

//En este ejemplo de encapsulamiento, se guardan los atributos de un medio de transporte
//en la clase Encapsulamiento, se declaran privados para restringir su acceso, pero tienen
//getters&setters para poder poner/conocer sus valores.

public class Encapsulamiento {
    
   private String marca;
   private int año;
   private String modelo;

   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
   
}
