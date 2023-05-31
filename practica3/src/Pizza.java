/**
 * Clase abstracta pizza con los metodos que adaptaremos a nuestra implementacion 
 * de Baguettes
*/

public abstract class Pizza{   

    /**
     * Metodo que nos da uno de los tipos de queso seleccionado
     * @return String tipo de queso
     */

    public abstract String getQueso();

    /**
     * Metodo que nos devuelve el tipo de carne selecionada
     * @return String tipo de caene 
     */
      
    public abstract String getCarne();

    /**
     * Metodo que nos regresa el tipo de masa selecionado
     * @return String tipo de masa
     */
      
    public abstract String getMasa();

    /**
     * Metodo que nos da el costo final de la pizza
     * @return double el costo de la pizza
     */
      
    public abstract double getCosto();
}
