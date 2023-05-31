/**
 * Clase del condimento Pollo que extiende de la clase Abstracta Condimento Baguette 
 * que nos da uno de los condimentos del baguette.
 */

public class Pollo extends CondimentoBaguette {

    /**
     * Constructor de la clase Pollo
     * @param baguette el baguette que podemos agregarle pollo.
     */

    public Pollo(Baguette baguette){
        this.baguette = baguette;
    }

    /**
     * Metodo que nos regresa el precio del baguette selecionado mas el precio del pollo.
     * @return double el precio del baguette con pollo. 
     */

    @Override
    public double getPrecio(){
        return baguette.getPrecio() + 25; //precio del pollo
    }

    /**
     * Metodo que nos regresa el baguette con la descripcion del ingrediente.
     * @return String de la descripcion del ingrediente pollo.
     */

    @Override
    public String getDescripcion(){
        return baguette.getDescripcion() + "con pollo, ";

    }

}