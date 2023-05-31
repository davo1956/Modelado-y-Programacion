/**
 * Clase de la pizza 2
 */

public class Pizza2 extends Pizza{

    /**
   * Metodo que regresa el queso de la pizza 2
   * @return String queso de la pizza
   */


    @Override public String getQueso(){
      return "manchego ";
    }

/**
 * Metodo que regresa el tipo de carne de la pizza2
 * @return String el tipo de carne
 */
    
    @Override public String getCarne(){
      return "salchicha y jamón ";
    }
    
    /**
     * Metodo que nos regresa el tipo de masa de la pizza
     * @return String el tipo de masa
     */
    
    
    @Override public String getMasa(){
      return "gruesa ";
    }

    /**
     * Metodo que nos da el costo de la pizza 1
     * @return double el costo de la pizza 2
     */

    
    @Override public double getCosto(){
      double d = 190.00;
      return d;
    }
    
}