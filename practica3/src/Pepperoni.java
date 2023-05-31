/*
*Clase del condimento Pepperoni que extiende de la clase Abstracta Condimento Baguette 
 * que nos da uno de los condimentos del baguette.
 */
public class Pepperoni extends CondimentoBaguette {

    /**
     * Constructor de la clase Peperoni
     * @param baguette el baguette que podemos agregarle peperoni.
     */

    public Pepperoni(Baguette baguette){
        this.baguette = baguette;
    }

    /**
     * Metodo que nos regresa el precio del baguette selecionado mas el precio del peperoni.
     * @return double el precio del baguette con peperoni. 
     */

    @Override
    public double getPrecio(){
        return baguette.getPrecio() + 18; //precio el peperoni
    }

    /**
     * Metodo que nos regresa el baguette con la descripcion del ingrediente.
     * @return String de la descripcion del ingrediente peperoni.
     */

    @Override
    public String getDescripcion(){
        return baguette.getDescripcion() + "con pepperoni, ";
    }


}