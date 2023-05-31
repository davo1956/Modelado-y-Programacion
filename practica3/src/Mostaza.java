/**
 * Clase del condimento Mostaza que extiende de la clase Abstracta Condimento Baguette 
 * que nos da uno de los condimentos del baguette.
 */
public class Mostaza  extends CondimentoBaguette {

    /**
     * Constructor de la clase Mostaza
     * @param baguette el baguette que podemos agregarle mostaza.
     */

    public Mostaza(Baguette baguette){
        this.baguette = baguette;
    }

    /**
     * Metodo que nos regresa el precio del baguette selecionado mas el precio del mostaza.
     * @return double el precio del baguette con mostaza. 
     */

    @Override
    public double getPrecio(){
        return baguette.getPrecio() + 10; //precio mostaza.
    }

     /**
     * Metodo que nos regresa el baguette con la descripcion del ingrediente.
     * @return String de la descripcion del ingrediente mostaza.
     */

    @Override
    public String getDescripcion(){
        return baguette.getDescripcion() + "con mostaza, ";
    }

}