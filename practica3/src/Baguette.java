/**
 * Clase Abstracta de Baguette, nos genera nuestro objeto de tipo baguette del cual 
 * tomaremos para crear los baguettes
 */

public abstract class Baguette {

    /**
     * Metodo getPrecio() que nos regresa eñl precio del baguette
     * @return double el precio
     */

    public abstract double getPrecio();

    /**
     * Metodo getDescripcion() que nos regresa el nombre del baguette
     * @return String de la descripcion del baguette
     */

    public abstract String getDescripcion();
}