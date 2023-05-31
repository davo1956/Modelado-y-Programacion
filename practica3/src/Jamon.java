/**
 * Clase del condimento Jamon que extiende de la clase Abstracta Condimento Baguette 
 * que nos da uno de los condimentos del baguette.
 */
public class Jamon extends CondimentoBaguette {

    /**
     * Constructor de la clase Jamon
     * @param baguette el baguette que podemos agregarle jamon.
     */

    public Jamon(Baguette baguette){
        this.baguette = baguette;
    }

    /**
     * Metodo que nos regresa el precio del baguette selecionado mas el precio del jamon.
     * @return double el precio del baguette con jamon. 
     */

    @Override 
    public double getPrecio(){
        return baguette.getPrecio() + 15; //precio del jamon
    }

    /**
     * Metodo que nos regresa el baguette con la descripcion del ingrediente.
     * @return String de la descripcion del ingrediente jamon.
     */

    @Override
    public String getDescripcion(){
        return baguette.getDescripcion() + "con jamon, ";
    }


}