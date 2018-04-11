/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.becario.arturobravo.encapsulamiento;

/**
 *
 * @author JAVA1
 */
public class Animal {
    
    // en esta clase se muestra la encapsulacion ya que los atributos se declaran privados para que no puedan acceder a ellos
    // en caso de que se quiera acceder a este objeto se tendria que hacer mediante los metodos getter y setter los cuales se declararon con un nivel de acceso public
    private String tipo;
    private String sexo;
    private int edad;

    public Animal(String tipo, String sexo, int edad) {
        this.tipo = tipo;
        this.sexo = sexo;
        this.edad = edad;
    }

    public Animal() {
    }
    
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
