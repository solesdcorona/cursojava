
package curso.java.becario.luisromero.encapsulamiento;

public class Animal {
    //Esta clase describe las propiedades de un Animal siendo la clase general
        private String tamanio; //Descripcion de las variables de la clase son las carateristicas principales de la entidad
        private int numeroPatas;
        private String color;
        private boolean viviparo;
        
        public Animal(String tamanio, int numeroPatas,String color,boolean viviparo){
            this.tamanio = tamanio;
            this.numeroPatas = numeroPatas;
            this.color = color;
            this.viviparo = viviparo;
        };
        //metodos get, sirve para visualizar una de las caracteristicas de la clase padre
        public String getTamanio() {
            return tamanio;
        }

        public int getNumeroPatas() {
            return numeroPatas;
        }

        public String getColor() {
            return color;
        }


        public boolean isViviparo() {
            return viviparo;
        }
       
}
