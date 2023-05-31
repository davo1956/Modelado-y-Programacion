/**
 *Clase de la pizza 3 que crearon los dueños anteriores, receta de ingredientes 
 */

public class Pizza3 extends Pizza{


  /**
   * Metodo que regresa el queso de la pizza 3
   * @return String queso de la pizza
   */

    @Override public String getQueso(){
      return "manchego y chedar ";
    }

    /**
     * Metodo que regresa el tipo de carne de la pizza
     * @return String el tipo de carne
     */
    
    @Override public String getCarne(){
      return "pollo ";
    }

    /**
     * Metodo que nos regresa el tipo de masa de la pizza
     * @return String el tipo de masa
     */
    
    @Override public String getMasa(){
      return "delgada ";
    }

    /**
     * Metodo que nos da el costo de la pizza 1
     * @return double el costo de la pizza 3
     */
    
    @Override public double getCosto(){
      double d = 175.00;
      return d;
    }
    
}