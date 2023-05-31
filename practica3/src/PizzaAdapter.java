/**
 * Clase que nos ayudará a adaptar la pizza como un baguette.
 */


public class PizzaAdapter extends Baguette{

    /**
     * Variable de tipo pizza
     */

    private Pizza pizza;

    /**
     * Constructor de la clase Pizza Adaptador
     */
    
    public PizzaAdapter(Pizza pizza){
      this.pizza = pizza;
    }

    /**
     * Metodo que nos regresa el precio de la pizza este metodo es de la 
     * clase abstracta Baguette
     */
    
    @Override public double getPrecio(){
      return pizza.getCosto();
    }

    /**
     * Metodo que nos regresa la descripcion de la pizza 
     * este metodo es propio de la clase abstracta Baguette
     */
    
    @Override public String getDescripcion(){
      return "Pizza " + pizza.getMasa() + "con " +
             pizza.getQueso() + ", " + pizza.getCarne() + ".";
    }
    
    }