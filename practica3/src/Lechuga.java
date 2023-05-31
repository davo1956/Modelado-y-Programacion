/**
 * Clase del condimento Lechuga que extiende de la clase Abstracta Condimento Baguette 
 * que nos da uno de los condimentos del baguette.
 */
public class Lechuga extends CondimentoBaguette {

    /**
     * Constructor de la clase Lechuga
     * @param baguette el baguette que podemos agregarle lechuga.
     */

    public Lechuga(Baguette baguette){
        this.baguette = baguette;
    }

    /**
     * Metodo que nos regresa el precio del baguette selecionado mas el precio de la lechuga.
     * @return double el precio del baguette con lechuga. 
     */

    @Override
    public double getPrecio(){
        return baguette.getPrecio() + 5; //precio de la lechuga.
    }

    /**
     * Metodo que nos regresa el baguette con la descripcion del ingrediente.
     * @return String de la descripcion del ingrediente lechuga.
     */

    @Override
    public String getDescripcion(){
        return baguette.getDescripcion() + "con lechuga, ";
    }

}