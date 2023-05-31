/**
 *Clase de la pizza 4 que crearon los dueños anteriores, receta de ingredientes 
 */

public class Pizza4 extends Pizza{

    /**
   * Metodo que regresa el queso de la pizza 4
   * @return String queso de la pizza
   */

    @Override public String getQueso(){
      return "chedar ";
    }

     /**
     * Metodo que regresa el tipo de carne de la pizza
     * @return String el tipo de carne
     */
    
    @Override public String getCarne(){
      return "salchicha y pollo ";
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
     * @return double el costo de la pizza 1
     */
    
    @Override public double getCosto(){
      double d = 170.00;
      return d;
    }
    
}