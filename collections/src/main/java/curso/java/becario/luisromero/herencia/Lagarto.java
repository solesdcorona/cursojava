package curso.java.becario.luisromero.herencia;

import curso.java.becario.luisromero.encapsulamiento.Animal;

public class Lagarto extends Animal {

    protected boolean venenoso;
    protected boolean acuatico;

    public Lagarto(String tamanio, int numeroPatas, String color, boolean viviparo, boolean venenoso, boolean acuatico) {
        super(tamanio, numeroPatas, color, viviparo); //constructor de la clase padre que sera llamada primero a traves de la palabra super

    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public boolean isAcuatico() {
        return acuatico;
    }

    public void setAcuatico(boolean acuatico) {
        this.acuatico = acuatico;
    }
}
